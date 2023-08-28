package telefone;

public interface AparelhoTelefonico {
    void ligarChamada(Contato contato);
    void desligarChamada();
    void atender();
    void buscarContatos(String nome);
    void excluirContato(String nome);
    void adicionarContato(Contato contato);
    void enviarSMS(String mensagem, Contato contato);
    void iniciarCorreioVoz();

}

