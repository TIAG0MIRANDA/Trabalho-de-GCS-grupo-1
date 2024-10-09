public class Censura {
    
    private static String[] palavrasbloqueadas = {
        "Anus", "Baba-ovo", "Babaovo", "Babaca", "Bacura", "Bagos", "Baitola", "Bebum", 
        "Besta", "Bicha", "Bisca", "Bixa", "Boazuda", "Boceta", "Boco", "Boiola", 
        "Bolagato", "Boquete", "Bolcat", "Bosseta", "Bosta", "Bostana", "Brecha", "Brexa", 
        "Brioco", "Bronha", "Buca", "Buceta", "Bunda", "Bunduda", "Burra", "Burro", 
        "Busseta", "Cadela", "Caga", "Cagado", "Cagao", "Cagona", 
        "Canalha", "Caralho", "Casseta", "Cassete", "Checheca", "Chereca", "Chibumba", 
        "Chibumbo", "Chifruda", "Chifrudo", "Chota", "Chochota", "Chupada", "Chupado", 
        "Clitoris", "Cocaina", "Coco", "Corna", "Corno", "Cornuda", "Cornudo", "Corrupta", 
        "Corrupto", "Cretina", "Cretino", "Cruz-credo", "Cu", "Culhao", "Curalho", 
        "Cuzao", "Cuzuda", "Cuzudo", "Debil", "Debiloide", "Defunto", "Demonio", "Difunto", 
        "Doida", "Doido", "Egua", "Escrota", "Escroto", "Esporrada", "Esporrado", 
        "Esporro", "Estupida", "Estupidez", "Estupido", "Fedida", "Fedido", "Fedor", 
        "Fedorenta", "Feia", "Feio", "Feiosa", "Feioso", "Feioza", "Feiozo", "Felacao", 
        "Fenda", "Foda", "Fodao", "Fode", "Fodida", "Fodido", "Fornica", "Fudendo", 
        "Fudecao", "Fudida", "Fudido", "Furada", "Furado", "Furão", "Furnica", "Furnicar", 
        "Furo", "Furona", "Gaiata", "Gaiato", "Gay", "Gonorrea", "Gonorreia", "Gosma", 
        "Gosmenta", "Gosmento", "Grelinho", "Grelo", "Homo-sexual", "Homossexual", 
        "Idiota", "Idiotice", "Imbecil", "Iscrota", "Iscroto", "Japa", "Ladra", "Ladrao", 
        "Ladroeira", "Ladrona", "Lalau", "Leprosa", "Leproso", "Lésbica", "Macaca", 
        "Macaco", "Machona", "Machorra", "Manguaca", "Masturba", "Meleca", "Merda", 
        "Mija", "Mijada", "Mijado", "Mijo", "Mocrea", "Mocreia", "Moleca", "Moleque", 
        "Mondronga", "Mondrongo", "Naba", "Nadega", "Nojeira", "Nojenta", "Nojento", 
        "Nojo", "Olhota", "Otaria", "Otario", "Paca", "Paspalha", "Paspalhao", "Paspalho", 
        "Pau", "Peia", "Peido", "Pemba", "Pênis", "Pentelha", "Pentelho", "Perereca", 
        "Peru", "Pica", "Picao", "Pilantra", "Piranha", "Piroca", "Piroco", "Piru", 
        "Porra", "Prega", "Prostibulo", "Prostituta", "Prostituto", "Punheta", 
        "Punhetao", "Pus", "Pustula", "Puta", "Puto", "Puxa-saco", "Rabao", "Rabo", 
        "Rabuda", "Rabudao", "Rabudo", "Rabudona", "Racha", "Rachada", "Rachadao", 
        "Rachadinha", "Rachadinho", "Rachado", "Ramela", "Remela", "Retardada", 
        "Retardado", "Ridícula", "Rola", "Rolinha", "Rosca", "Sacana", "Safada", 
        "Safado", "Sapatao", "Sifilis", "Siririca", "Tarada", "Tarado", "Testuda", 
        "Tezao", "Tezuda", "Tezudo", "Trocha", "Trolha", "Troucha", "Trouxa", "Troxa", 
        "Vaca", "Vagabunda", "Vagabundo", "Vagina", "Veada", "Veadao", "Veado", 
        "Viada", "Viadao", "Xavasca", "Xerereca", "Xexeca", "Xibiu", "Xibumba", 
        "Xota", "Xochota", "Xoxota", "Xana", "Xaninha"
    };
    


    public static boolean censura(String string){
    
       string = string.replace('1','i');
       string = string.replace('0','o');
       string = string.replace('3','e');
       string = string.replace('5','s');
       string = string.replace('4','a');
       string = string.replace('7','t');  
        
        for(String censura: palavrasbloqueadas){

            if(string.toLowerCase().contains(censura.toLowerCase())){

                return true;

            }

        }

            return false;

    }

}
