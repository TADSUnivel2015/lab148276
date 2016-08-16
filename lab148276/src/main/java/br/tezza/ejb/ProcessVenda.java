package br.tezza.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.Stateless;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.tezza.pojo.PojoVenda;

@Stateless
public class ProcessVenda {

    public void processarVenda(PojoVenda venda) {

    }

}
