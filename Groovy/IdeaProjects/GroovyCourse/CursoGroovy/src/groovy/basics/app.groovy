package groovy.basics

//Criação de instância da Classe "Developer"
Developer d = new Developer()
d.first = "Pedro"
d.setLast("Guedes")

//Atribuindo mais linguagens
d.languages << "Groovy"
d.languages << "Java"

//Chamando outros métodos
d.work()