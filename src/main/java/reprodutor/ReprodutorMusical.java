package reprodutor;

public interface ReprodutorMusical {
    void tocarMusica(String musica);
    void pausarMusica();
    void tocarVideo(String video);
    void pausarVideo();
    void selecionarMusica(String musica);
    void selecionarVideo(String video);
    void excluirMusica(String musica);
    void excluirVideo(String video);
    void adicionarMusica(String musica);
    void adicionarVideo(String video);

}

