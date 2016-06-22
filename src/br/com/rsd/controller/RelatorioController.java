
package br.com.rsd.controller;

import br.com.rsd.dao.RelatorioDao;

public class RelatorioController {
        public static boolean relatorio(String filtro, String nomeRel) throws Exception
    {
        return RelatorioDao.relatorio(filtro, nomeRel);
    }
}
