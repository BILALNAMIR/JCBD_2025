//TODO: Insert here your definition logic CRUD
/*************************************************************************************
 *************************************************************************************
 ** Sample CRUD Simple - Produto
 *************************************************************************************
 *************************************************************************************/
//@JArchGenerateLogicCrud(nameSubPackage = "produto",
//    master = @JArchGenerateMaster(name = "Produto", tableName = "tb_produto",
//        fields = {
//            @JArchGenerateField(fieldName = "codigo", fieldTable = "cd_produto", description = "Código",
//                type = FieldType.CODE, codeLookup = true,  required = true, exclusive = true,
//                search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//            @JArchGenerateField(fieldName = "descricao", fieldTable = "ds_produto", description = "Descrição",
//                type = FieldType.DESCRIPTION, descriptionLookup = true, required = true, exclusive = true,
//                search = @JArchGenerateSearch(row = 1, column = 2, span = 9),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true)),
//            @JArchGenerateField(fieldName = "valorCusto", fieldTable = "vl_custo", description = "Valor Custo",
//                type = FieldType.MONEY, required = true,
//                search = @JArchGenerateSearch(row = 2, column = 1, span = 3),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 3, columnDataXhtml = 1, showDataTableList = true)),
//            @JArchGenerateField(fieldName = "valorVenda", fieldTable = "vl_venda", description = "Valor Venda",
//                type = FieldType.MONEY, required = true,
//                search = @JArchGenerateSearch(row = 2, column = 3, span = 3),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 4, columnDataXhtml = 1, showDataTableList = true)),
//        }
//    )
//)

/*************************************************************************************
 *************************************************************************************
 ** Sample CRUD Master Detail - Pedido / Produto
 *************************************************************************************
 *************************************************************************************/
//@JArchGenerateLogicMasterDetail(nameSubPackage = "pedido",
//    master = @JArchGenerateMaster(name = "Pedido", tableName = "tb_pedido",
//        fields = {
//            @JArchGenerateField(fieldName = "codigo", fieldTable = "cd_pedido",
//                description = "Código", type = FieldType.CODE, codeLookup = true, required = true, exclusive = true,
//                search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//            @JArchGenerateField(fieldName = "dataHora", fieldTable = "dh_pedido",
//                description = "Data/Hora", type = FieldType.DATE_TIME, required = true,
//                search = @JArchGenerateSearch(row = 1, column = 1, span = 9),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true))
//        }
//    ),
//    details = {
//        @JArchGenerateDetail(name = "Pedido Produto", tableName = "tb_pedido_produto",
//            fields = {
//                @JArchGenerateField(fieldName = "produto", fieldTable = "id_produto", description = "Produto",
//                    type = FieldType.ENTITY,
//                    search = {},
//                    xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = false)),
//                @JArchGenerateField(fieldName = "quantidade", fieldTable = "qt_produto", description = "Quantidade",
//                    type = FieldType.QUANTITY,
//                    search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                    xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//                @JArchGenerateField(fieldName = "valorUnitario", fieldTable = "vl_unitario", description = "Valor Unitário",
//                    type = FieldType.MONEY,
//                    search = @JArchGenerateSearch(row = 1, column = 2, span = 3),
//                    xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true)),
//            })
//    }
//)

/*************************************************************************************
 *************************************************************************************
 ** Sample CRUD Master Detail SubDetail - Marca / Modelo / SubModelo
 *************************************************************************************
 *************************************************************************************/
//@JArchGenerateLogicMasterSubDetail(nameSubPackage = "marca",
//    master = @JArchGenerateMaster(name = "Marca", tableName = "tb_marca",
//        fields = {
//            @JArchGenerateField(fieldName = "codigo", fieldTable = "cd_marca", description = "Código",
//                type = FieldType.CODE,
//                search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//            @JArchGenerateField(fieldName = "descricao", fieldTable = "ds_marca", description = "Descrição",
//                type = FieldType.DESCRIPTION,
//                search = @JArchGenerateSearch(row = 1, column = 2, span = 9),
//                xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true)),
//        }),
//    details = {
//        @JArchGenerateDetailSubDetail(name = "Modelo", tableName = "tb_marca_modelo",
//            fields = {
//                @JArchGenerateField(fieldName = "codigo", fieldTable = "cd_modelo", description = "Código",
//                    type = FieldType.CODE,
//                    search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                    xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//                @JArchGenerateField(fieldName = "descricao", fieldTable = "ds_modelo", description = "Descrição",
//                    type = FieldType.DESCRIPTION,
//                    search = @JArchGenerateSearch(row = 1, column = 2, span = 9),
//                    xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true)),
//            },
//            subDetails = {
//                @JArchGenerateSubDetail(name = "SubModelo", tableName = "tb_marca_modelo_submodelo",
//                    fields = {
//                        @JArchGenerateField(fieldName = "codigo", fieldTable = "cd_submodelo", description = "Código",
//                            type = FieldType.CODE,
//                            search = @JArchGenerateSearch(row = 1, column = 1, span = 3),
//                            xhtml = @JArchGenerateXhtml(rowDataXhtml = 1, columnDataXhtml = 1, showDataTableList = true)),
//                        @JArchGenerateField(fieldName = "descricao", fieldTable = "ds_submodelo", description = "Descrição",
//                            type = FieldType.DESCRIPTION,
//                            search = @JArchGenerateSearch(row = 1, column = 2, span = 9),
//                            xhtml = @JArchGenerateXhtml(rowDataXhtml = 2, columnDataXhtml = 1, showDataTableList = true)),
//                    })
//            } )
//
//    })
package hibernate.sports.ex1.sports.ex1.client;

