package hibernate.sports.ex1.sports.ex1.web.login;

import br.com.jarch.annotation.JArchViewScoped;
import br.com.jarch.faces.menu.BaseMenuController;
import br.com.jarch.crud.menu.IMenu;
import br.com.jarch.crud.menu.MenuBuilder;
import br.com.jarch.util.BundleUtils;

import java.util.ArrayList;
import java.util.List;

@JArchViewScoped
public class MenuController extends BaseMenuController {

    @Override
    public List<IMenu> createMenu() {

        List<IMenu> menu = new ArrayList<>();

        menu.add(MenuBuilder
                .newInstance()
                .name(BundleUtils.messageBundle("label.cadastro"))
                .addSubMenu(MenuBuilder
                        .newInstance()
                        .name(BundleUtils.messageBundle("label.cadastro1"))
                        .action("../cadastro/cadastro1.jsf")
                        .build())
                .build());

        menu.add(MenuBuilder
                .newInstance()
                .name(BundleUtils.messageBundle("label.lancamento"))
                .addSubMenu(MenuBuilder
                        .newInstance()
                        .name(BundleUtils.messageBundle("label.lancamento1"))
                        .action("../lancamento/lancamento1.jsf")
                        .build())
                .build());

        menu.add(MenuBuilder
                .newInstance()
                .name(BundleUtils.messageBundle("label.relatorio"))
                .addSubMenu(MenuBuilder
                        .newInstance()
                        .name(BundleUtils.messageBundle("label.relatorio1"))
                        .action("../relatorio/relatorio1.jsf")
                        .build())
                .build());

        menu.add(MenuBuilder
                .newInstance()
                .name(BundleUtils.messageBundle("label.parametro"))
                .action("../parameter/parameter.jsf")
                .build());

        return menu;
    }
}