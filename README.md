1 - A abstração é a operação em que alguma coisa é escolhida como objeto de percepção, atenção ou observação, numa relação maior. 
2 - Ocultamento de informação são informações que estão armazenadas.
3 - Um código coeso é um código bem feito, onde tudo se conecta e funciona bem.

SOLID é um conjunto de cinco princípios que ajudam a criar software com código mais limpo, fácil de entender, manter e ampliar.
S - Single Responsibility Principle (Princípio da Responsabilidade Única): Uma classe deve ter apenas uma única responsabilidade ou motivo para mudar.
O - Open/Closed Principle (Princípio Aberto/Fechado): Software deve estar aberto para extensão, mas fechado para modificação.
L - Liskov Substitution Principle (Princípio da Substituição de Liskov): Objetos de uma classe derivada devem poder substituir objetos da classe base sem alterar o funcionamento do programa.
I - Interface Segregation Principle (Princípio da Segregação de Interfaces): Muitas interfaces específicas são melhores do que uma interface geral.
D - Dependency Inversion Principle (Princípio da Inversão de Dependência): Dependa de abstrações, não de implementações concretas.

O Princípio da Inversão de Dependência diz que módulos de alto nível não devem depender diretamente de módulos de baixo nível, ambos devem depender de abstrações (interfaces ou classes abstratas). Além disso, abstrações não devem depender de detalhes, mas sim os detalhes dependerem das abstrações. Isso promove flexibilidade e reduz o acoplamento no sistema.

É recomendado criar funcionalidades combinando objetos (composição) em vez de estender classes (herança) sempre que possível. Isso evita acoplamento rígido, facilita a reutilização de código e torna o sistema mais flexível para mudanças, já que o comportamento pode ser alterado trocando componentes, sem modificar hierarquias de classes.

O Princípio de Demeter, também chamado de Princípio do Menor Conhecimento, estabelece que um método deve interagir apenas com objetos diretamente relacionados a ele: sua própria classe, objetos recebidos como parâmetros, objetos criados pelo próprio método ou atributos da classe. Essa prática reduz o acoplamento e preserva o encapsulamento, evitando dependências desnecessárias e aumentando a flexibilidade do código, prevenindo chamadas encadeadas que expõem detalhes internos e fragilizam o sistema.

Diferença entre Arquitetura e Design: A diferença entre arquitetura e design de software está no nível de abstração e no foco das decisões. A arquitetura representa a visão macro do sistema, definindo seus principais componentes, como eles se relacionam e garantindo requisitos não funcionais, como desempenho, segurança e escalabilidade. Já o design corresponde à visão micro, lidando com detalhes de implementação, como algoritmos, estruturas de dados e padrões de projeto, estando mais próximo do código e sujeito a mudanças frequentes.

Formação do conhecimento de um arquiteto modelo T: A formação do arquiteto modelo T ocorre pelo desenvolvimento de dois tipos de conhecimento. Na dimensão horizontal, ele adquire visão ampla de várias áreas, linguagens, bancos de dados, metodologias e até aspectos de negócios, o que permite integrar equipes e compreender o sistema como um todo. Já na dimensão vertical, ele se aprofunda em um campo específico, como segurança, nuvem ou microsserviços, garantindo domínio técnico e capacidade de decisão. Assim, o arquiteto modelo T equilibra amplitude e profundidade, unindo estratégia e especialização.
