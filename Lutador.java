package uec;
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade;
    private float altura, peso;
    private int vitorias, derrotas, empates;

    // Metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, 
                   int vi, int de, int em) { // constructor
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    
    public int getIdade() {
        return idade;
    }        
    public void setIdade(int id) {
        this.idade = id;       
    }
    
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }    
    public String getCategoria() {
        return categoria;    
    }        
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }        
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }   
    
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    
    // Metodos publicos    
    public void apresentar() {
        System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando "+ this.getPeso() +"Kg");
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu "+ this.getDerrotas() + " vezes");
        System.out.println("Empatou "+ this.getEmpates() + " vezes");    
    }
    
    public void status() {
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println(this.getVitorias() +" vitorias");
        System.out.println(this.getDerrotas() +" derrotas");
        System.out.println(this.getEmpates() +" empates");
    }
        
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }  
    
}
