package bicho;

public class Bicho {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    public Bicho(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 50; 
        this.forca = 50;
    }

    public void comer() {
        if (vivo) {
            caloria = Math.min(100, caloria + 20);
            System.out.println(nome + " comeu e agora tem " + caloria + " calorias.");
        }
    }

    public void dormir() {
        if (vivo) {
            forca = Math.min(100, forca + 10);
            System.out.println(nome + " dormiu e agora tem " + forca + " de força.");
        }
    }

    public void correr() {
        if (vivo) {
            if (caloria >= 10 && forca >= 10) {
                caloria -= 10;
                forca -= 10;
                System.out.println(nome + " correu e agora tem " + caloria + " calorias e " + forca + " de força.");
            } else {
                System.out.println(nome + " está cansado demais para correr.");
            }
        }
    }

    public void morrer() {
        vivo = false;
        forca = 0;
        System.out.println(nome + " morreu.");
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getCaloria() {
        return caloria;
    }

    public int getForca() {
        return forca;
    }

    public int getIdade() {
        return idade;
    }

}