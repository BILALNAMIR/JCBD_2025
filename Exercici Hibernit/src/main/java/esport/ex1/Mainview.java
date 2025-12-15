package esport.ex1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import org.hibernate.Transaction;

public class Mainview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		boolean opcio = false;
		
		while(!opcio) {
			
			System.out.println("--------menu--------"
					+ "\n1.Afegir Atleta"
					+ "\n2.Afegir Esport"
					+ "\n3.Buscar Atleta"
					+ "\n4.Llestar Atletes"
					+ "\n5.Llestar Esports"
					+ "\n6.Surtir");
			
			int op = Integer.parseInt(sc.nextLine());
			
			switch (op) {
			case 1:
				String nom;
				int CodDep;
				System.out.println("Introduix el nom de atleta");
				nom = sc.nextLine();
				System.out.println("Introduix el cod de esport que practica");
				CodDep = Integer.parseInt(sc.nextLine());
				Esport esp = session.get(Esport.class, CodDep);
				
				if(esp!= null) {
					Atleta at = new Atleta(nom,esp);
					Transaction tx = session.beginTransaction();
					
					Atleta a = session.merge(at);
					
					tx.commit();
					
					System.out.println(a.getCod()+"-"+a.getNombre()+"-"+a.getCodeDeporte()+" : Afegit amb exit!.");
				}else {
					System.out.println("Code del esport no existeix!");
				}
				
				break;
			case 2:
				String nomEsport;
				System.out.println("Introduix el nom de esport");
				nomEsport = sc.nextLine();
				
				Transaction tx = session.beginTransaction();
				
				Esport es = new Esport(nomEsport);
				Esport e = session.merge(es);
				
				tx.commit();
				
				System.out.println(e.getCod()+"-"+e.getNombre()+" : Afegit amb exit!.");
				break;
			case 3:
				System.out.println("Introueix el nom");
				String text = sc.nextLine();
				try {
					List<Atleta> atletes = session.createQuery("FROM Atleta WHERE lower(nombre) LIKE :text",Atleta.class).
							setParameter("text", "%"+text+"%").
							getResultList();
					if (!atletes.isEmpty()) {
						for(Atleta a : atletes) {
							int codDep = a.getCodeDeporte();
							Esport esport =  session.get(Esport.class, codDep);
							System.out.println(a.getCod()+"-"+a.getNombre()+"-"+esport.getNombre());
							
						}
					}else {
						System.out.println("No hi cap Atleta amb aquest nom");
					}
				}catch (Exception e2) {
					// TODO: handle exception
				}
				
				break;
			case 4:
				List<Atleta> atletess = session.createQuery("FROM Atleta", Atleta.class).list();
				for(Atleta a : atletess) {
					
					System.out.println(a.getCod()+"-"+a.getNombre()+"-"+a.getCodeDeporte()+" : Afegit amb exit!.");

				}
				break;
			case 5:
				List<Esport> espoo = session.createQuery("FROM Esport", Esport.class).list();
				for(Esport ess : espoo) {
					
					System.out.println(ess.getCod()+"-"+ess.getNombre());

				}
				
			default:
				break;
			}
			
		}
	}

}
