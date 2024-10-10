public class Item {

    //Placeholder, responsabilidade da outra branch

    private String nome,definition,categoria;
    private double price;
    private int cod;

    public Item(String name,String def,double val,int cod,String ctg){

                this.nome = name;
                this.definition = def;
                this.price = val;
                this.cod = cod;
                this.categoria =ctg;
    }

    public void itemPrint(){

        String tempdef = this.definition;
        String tempnome = this.nome;
        if(this.definition.length() > 70){

            tempdef = this.definition.substring(0,70);
            
        }

        if(this.nome.length() > 30){

            tempnome = this.nome.substring(0,30);
            
        }

        System.out.printf("| %-30s | %-70s | %-9.2f | %-18s |  %-3d  |\n",tempnome,tempdef,this.price,this.categoria,this.cod);

    }

    public String getname(){

        return this.nome;

    }

    public String getdef(){

        return this.definition;

    }

    public String getctg(){

        return this.categoria;

    }

    public double getprice(){

        return this.price;

    }

    public int getcod(){

        return this.cod;

    }

}
