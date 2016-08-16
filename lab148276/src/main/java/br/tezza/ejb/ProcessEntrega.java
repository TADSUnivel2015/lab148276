package br.tezza.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.Stateless;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.tezza.pojo.PojoEntrega;

@Stateless
public class ProcessEntrega {

    public void processarEntrega (PojoEntrega entrega) {

    }

}
