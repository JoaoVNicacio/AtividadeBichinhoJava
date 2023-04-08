public class Animal {
  protected String nome;
  protected String classe;
  protected String família;
  protected int idade;
  protected boolean estado;
  protected double calorias;
  protected byte forca;

  public Animal(String nome,
      String classe,
      String família) {
    this.nome = nome;
    this.classe = classe;
    this.família = família;
    this.idade = 0;
    this.estado = true;
    this.calorias = 10;
    this.forca = (byte) 10;
  }

  public void comer(double caloriasDeglutidas) {
    if (estado = true || calorias >= 0 || calorias < 100) {
      setForca((byte) (forca - 2));
      setCalorias((byte) (calorias + 10));

      if (calorias > 100) {
        setCalorias(100);
      }

      System.out.println("Comendo...\n A sua força é de " + getForca() + "\n  E suas calorias são " + getCalorias());
    } else {
      System.out.println("Não é possível realizar a ação.");
    }

    if (forca <= 0) {
      morrer();
    }

    if (forca > 100) {
      setForca((byte) 100);
      ;
    }

  }

  public void correr() {
    if (estado = true || calorias >= 0 || forca >= 0) {
      setForca((byte) (forca - 5));
      setCalorias((byte) (calorias - 5));

      System.out.println("Correndo...\n A sua força é de " + getForca() + "\n  E suas calorias são " + getCalorias());

      if (forca <= 0) {
        morrer();
      }
    } else {
      System.out.println("Não é possível realizar a ação.");
    }

  }

  public void dormir() {
    if (estado = true || forca > 0) {
      setForca((byte) (forca + 10));
      setCalorias((byte) (calorias - 2));

      if (forca > 100) {
        setForca((byte) 100);
        ;
      }

      if (forca <= 0) {
        morrer();
      }
      
      System.out.println("ZzzZzZzzZ\n  A sua força é de " + getForca() + "\n  E suas calorias são " + getCalorias());

    } else {
      System.out.println("Não é possível realizar a ação.");

    }
  }

  public void morrer() {
    setEstado(false);
    System.out.println("RIP");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public String getFamília() {
    return família;
  }

  public void setFamília(String família) {
    this.família = família;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean getEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  public double getCalorias() {
    return calorias;
  }

  public void setCalorias(double calorias) {
    this.calorias = calorias;
  }

  public int getForca() {
    return forca;
  }

  public void setForca(byte forca) {
    this.forca = forca;
  }
}
