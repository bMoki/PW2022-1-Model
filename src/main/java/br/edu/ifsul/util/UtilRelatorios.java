package br.edu.ifsul.util;

import br.edu.ifsul.modelo.Cidade;
import br.edu.ifsul.modelo.Pessoa;
import br.edu.ifsul.modelo.Time;
import br.edu.ifsul.modelo.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class UtilRelatorios {
    
    public static List<Time> carregaTimes(){
        List<Time> lista = new ArrayList<>();
        Time  t1 = new Time();
        t1.setNome("Gaucho de Passo Fundo");
        t1.setId(1);
        t1.setDataFundacao(Calendar.getInstance());
        Cidade c = new Cidade();
        c.setNome("Passo Fundo");
        t1.setCidade(c);
        Pessoa tecnico = new Pessoa();
        tecnico.setNome("João");
        t1.setTecnico(tecnico);
        Usuario u = new Usuario();
        u.setNome("jorge");
        t1.setUsuario(u);
        lista.add(t1);
        Time  t2 = new Time();
        t2.setNome("Gaucho de Passo Fundo");
        t2.setId(2);
        t2.setDataFundacao(Calendar.getInstance());
        t2.setCidade(c);  
        t2.setTecnico(tecnico); 
        t2.setUsuario(u);
        lista.add(t2);        
        return lista;
    }

}
