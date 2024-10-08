System.out.println("[6] Listar propostas feitas");
System.out.println("[7] Listar propostas recebidas");



case "6":
    Clear.clear();
    usuarioAtual.listarTrocasFeitas();
    sc.nextLine(); 
    break;

case "7":
    Clear.clear();
    usuarioAtual.listarTrocasRecebidas();
    sc.nextLine(); 
    break;
