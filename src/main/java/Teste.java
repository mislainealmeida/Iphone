import telefone.Contato;
import telefone.Iphone;

public class Teste {

        public static void main(String[] args) {
            Iphone iphone = new Iphone("12345", "iPhone 13");

            iphone.ligar();
            System.out.println("--------------------------------");

            iphone.tocarMusica("Música A");
            iphone.pausarMusica();
            iphone.tocarVideo("Vídeo 1");
            iphone.pausarVideo();
            iphone.selecionarMusica("Música B ");
            iphone.selecionarVideo("Vídeo 2");
            iphone.excluirMusica("Música C");
            iphone.excluirVideo("Vídeo 3");
            iphone.adicionarMusica("Música D");
            iphone.adicionarVideo("Vídeo 4");
            System.out.println("--------------------------------");

            iphone.atender();
            iphone.desligarChamada();
            iphone.buscarContatos("Eduardo");
            Contato contatoParaChamada = new Contato("Eduardo", "12345-6789");
            iphone.ligarChamada(contatoParaChamada);
            iphone.desligarChamada();
            iphone.excluirContato("Larissa");
            Contato novoContato = new Contato("Juliana", "123456789");
            iphone.adicionarContato(novoContato);
            iphone.enviarSMS("Olá, tudo bem?", novoContato);
            iphone.iniciarCorreioVoz();
            System.out.println("--------------------------------");

            iphone.exibirPagina("www.exemplo.com");
            iphone.adicionarNovaPagina("www.pagina.com");
            iphone.atualizarPagina();
            System.out.println("--------------------------------");


            iphone.desligar();
        }
    }

