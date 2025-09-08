package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteClienteUpdateCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();
        ClienteDAO clienteDAO = new ClienteDAO(con);
        cliente.setIdCliente(Integer.parseInt("2143"));
        cliente.setNomeCliente("Bardock");
        cliente.setPlaca("BD342");
        System.out.println(clienteDAO.alterar(cliente));
        ConnectionFactory.fecharConexao(con);
    }
}
