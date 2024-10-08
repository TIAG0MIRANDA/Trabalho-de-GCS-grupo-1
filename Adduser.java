private ArrayList<Trade> trocasFeitas = new ArrayList<>();    
private ArrayList<Trade> trocasRecebidas = new ArrayList<>(); 


public void addTrocaFeita(Trade troca) {
    trocasFeitas.add(troca);
}


public void addTrocaRecebida(Trade troca) {
    trocasRecebidas.add(troca);
}

public void listarTrocasFeitas() {
    if (trocasFeitas.isEmpty()) {
        System.out.println("Nenhuma proposta de troca feita.");
    } else {
        for (Trade troca : trocasFeitas) {
            System.out.println("Proposta feita: " + troca.verProposta());
        }
    }
}


public void listarTrocasRecebidas() {
    if (trocasRecebidas.isEmpty()) {
        System.out.println("Nenhuma proposta de troca recebida.");
    } else {
        for (Trade troca : trocasRecebidas) {
            System.out.println("Proposta recebida: " + troca.verProposta());
        }
    }
}
