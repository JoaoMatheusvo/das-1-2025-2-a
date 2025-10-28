## Aula 04/08

### Abstração:
É a operação em que alguma coisa é escolhida como objeto de percepção, atenção ou observação, numa relação maior. 
### Ocultamento de informação:
São informações que estão armazenadas.
### Um código coeso:
É um código bem feito, onde tudo se conecta e funciona bem.
### Acoplamento:
É o nível de dependência entre diferentes módulos ou classes de um sistema. Quando o acoplamento é baixo, cada componente funciona de forma mais independente, o que torna o software mais flexível, fácil de manter e de evoluir. Já um alto acoplamento dificulta alterações, pois mudanças em um módulo podem afetar vários outros.
### Princípios de projeto de código:
Reúnem práticas que orientam a construção de sistemas bem estruturados. Entre eles estão a coesão, a separação de responsabilidades e o uso de padrões de design. O objetivo é garantir clareza, extensibilidade e facilidade de manutenção, além de tornar o código mais confiável e adaptável a mudanças futuras.
### Padronização de código:
Consiste em definir convenções comuns para a escrita do software, como nomenclatura de variáveis, estilo de formatação e organização das classes. Essa prática promove consistência entre os desenvolvedores, melhora a legibilidade e reduz falhas de comunicação, além de facilitar a colaboração em equipe e a evolução do projeto.

## Aula 05/08

### SOLID:
É um conjunto de cinco princípios que ajudam a criar software com código mais limpo, fácil de entender, manter e ampliar.
### S - Single Responsibility Principle (Princípio da Responsabilidade Única): 
Uma classe deve ter apenas uma única responsabilidade ou motivo para mudar.
### O - Open/Closed Principle (Princípio Aberto/Fechado): 
Software deve estar aberto para extensão, mas fechado para modificação.
### L - Liskov Substitution Principle (Princípio da Substituição de Liskov): 
Objetos de uma classe derivada devem poder substituir objetos da classe base sem alterar o funcionamento do programa.
### I - Interface Segregation Principle (Princípio da Segregação de Interfaces):
Muitas interfaces específicas são melhores do que uma interface geral.
### D - Dependency Inversion Principle (Princípio da Inversão de Dependência): 
Dependa de abstrações, não de implementações concretas.

### O Single Responsibility Principle, ou Princípio da Responsabilidade Única:
É o primeiro dos princípios do SOLID. Ele afirma que uma classe deve ter apenas um motivo para mudar, ou seja, deve ser responsável por apenas uma parte específica da funcionalidade do sistema.
Esse princípio evita que uma única classe acumule múltiplas responsabilidades, o que dificultaria a manutenção e aumentaria o risco de falhas em cascata. Com SRP, o código fica mais organizado, legível e fácil de testar, já que cada classe tem uma função clara e bem definida.
### O Interface Segregation Principle, ou Princípio da Segregação de Interfaces: 
É o quarto princípio do SOLID. Ele afirma que nenhuma classe deve ser obrigada a depender de métodos que não utiliza.
Em termos práticos, isso significa que interfaces devem ser pequenas, específicas e coesas, em vez de conter muitos métodos genéricos. Quando uma interface é muito ampla (fat interface), as classes que a implementam podem acabar tendo que definir comportamentos que não fazem sentido para elas, gerando código desnecessário e difícil de manter.

## Aula 11/08

### O Princípio da Inversão de Dependências (Dependency Inversion Principle): 
É o último dos princípios do SOLID. Ele afirma que:
1 - Módulos de alto nível não devem depender de módulos de baixo nível; ambos devem depender de abstrações.
2 - As abstrações não devem depender de detalhes; os detalhes devem depender de abstrações.
Na prática, isso significa que classes mais “importantes” (alto nível, como regras de negócio) não devem estar diretamente acopladas a classes de implementação (baixo nível, como acesso a banco ou drivers). Em vez disso, ambas devem se conectar por meio de interfaces ou classes abstratas.
### O princípio “Prefira composição a herança”:
É uma recomendação de design orientado a objetos que sugere dar preferência ao uso de composição (um objeto sendo formado por outros objetos) em vez de recorrer diretamente à herança (uma classe filha estendendo outra).
Na herança, a classe filha fica fortemente acoplada à classe pai, herdando todos os seus comportamentos, mesmo os que não fazem sentido. Isso pode gerar problemas de flexibilidade e reutilização, além de dificultar alterações futuras. Já na composição, uma classe utiliza instâncias de outras classes para formar seu comportamento, o que promove baixo acoplamento e maior reutilização de código.
### Princípio de Demeter (menor conhecimento):
Estabelece que um método deve interagir apenas com objetos diretamente relacionados a ele: sua própria classe, objetos recebidos como parâmetros, objetos criados pelo próprio método ou atributos da classe. Essa prática reduz o acoplamento e preserva o encapsulamento, evitando dependências desnecessárias e aumentando a flexibilidade do código, prevenindo chamadas encadeadas que expõem detalhes internos e fragilizam o sistema.
### Princípio Aberto/Fechado:
É um dos princípios do SOLID e afirma que uma entidade de software (classe, módulo ou função) deve estar aberta para extensão, mas fechada para modificação.
Na prática, isso significa que você deve poder adicionar novos comportamentos a um sistema sem alterar o código já existente. Alterar diretamente uma classe existente pode introduzir erros e quebrar funcionalidades que já funcionam, enquanto estender seu comportamento por meio de herança, interfaces ou composição mantém o código seguro e estável.

## Aula 12/08

### Princípio Liskov: 
É um dos princípios do SOLID e estabelece que uma classe derivada deve poder substituir sua classe base sem alterar o comportamento esperado do programa.
Em outras palavras, objetos de uma classe filha devem ser intercambiáveis com objetos da classe pai, garantindo que o código que depende da classe base continue funcionando corretamente. Se a classe filha viola esse princípio, ela quebra a abstração e pode causar erros sutis no sistema.

## Aula 26/08

### Definir Introdução a arquitetura (características, princípios e decisões):
A introdução à arquitetura de software trata do estudo da estrutura e organização de sistemas de software, enfocando como os componentes se relacionam e como decisões de projeto afetam a qualidade e a manutenção do sistema.
### Características da arquitetura de software:
Estrutura organizada: Define os componentes do sistema e suas interações.
Visibilidade e documentação: Permite que desenvolvedores e stakeholders compreendam a organização e comportamento do sistema.
Qualidade e atributos: Influencia desempenho, segurança, escalabilidade, manutenibilidade e reutilização.
### Princípios da arquitetura de software:
Separação de responsabilidades: Cada módulo ou componente tem funções claras e coesas.
Abstração e encapsulamento: Esconde detalhes de implementação e expõe apenas interfaces necessárias.
Baixo acoplamento e alta coesão: Componentes dependem minimamente uns dos outros, mas internamente são consistentes.
Reuso e extensibilidade: Facilita a adição de novos comportamentos sem alterar o núcleo do sistema.
### Decisões de arquitetura:
São escolhas estratégicas tomadas no início do desenvolvimento, incluindo:
Definição de padrões e estilos arquiteturais (camadas, cliente-servidor, microserviços, etc.).
Determinação de tecnologias e frameworks a serem usados.
Estabelecimento de interfaces, protocolos e contratos entre componentes.
Planejamento de atributos de qualidade, como desempenho, confiabilidade e segurança.

## Aula 01/09

### Expectativas de um arquiteto: 
Um arquiteto de software é esperado planejar, projetar e guiar a implementação de sistemas, garantindo que atendam aos requisitos de negócio e aos atributos de qualidade (como desempenho, segurança e manutenibilidade). Ele atua como referência técnica, equilibrando decisões estratégicas e operacionais.
### Decisões de arquitetura:
São escolhas deliberadas que definem como o sistema será estruturado e construído, incluindo padrões arquiteturais, tecnologias, frameworks e interfaces. Essas decisões têm impacto direto na qualidade, escalabilidade e flexibilidade do software.
### Analisar continuamento a arquitetura:
A arquitetura deve ser avaliada e ajustada regularmente para identificar problemas, otimizar desempenho, atender a novos requisitos e garantir que o sistema continue alinhado aos objetivos do negócio.
### Manter-se atualizado:
O arquiteto precisa acompanhar tendências tecnológicas, novas práticas e ferramentas, garantindo que a arquitetura evolua de forma moderna e eficaz, aproveitando inovações que agreguem valor ao sistema.
### Domínio do negócio:
Ter conhecimento profundo do negócio e dos processos da organização permite que o arquiteto tome decisões que alinhem a arquitetura aos objetivos estratégicos, tornando o software realmente útil e relevante.
### DevOps:
DevOps é a prática de integração entre desenvolvimento e operações, promovendo automação, entrega contínua e monitoramento do software. Para o arquiteto, compreender DevOps ajuda a criar sistemas mais confiáveis, escaláveis e fáceis de implantar e manter.

## Aula 02/09

### Resuma a diferença entre: Arquitetura e Design:
Diferença entre Arquitetura e Design: A diferença entre arquitetura e design de software está no nível de abstração e no foco das decisões. A arquitetura representa a visão macro do sistema, definindo seus principais componentes, como eles se relacionam e garantindo requisitos não funcionais, como desempenho, segurança e escalabilidade. Já o design corresponde à visão micro, lidando com detalhes de implementação, como algoritmos, estruturas de dados e padrões de projeto, estando mais próximo do código e sujeito a mudanças frequentes.
### Como é a formação do conhecimento de um arquiteto modelo T?:
Formação do conhecimento de um arquiteto modelo T: A formação do arquiteto modelo T ocorre pelo desenvolvimento de dois tipos de conhecimento. Na dimensão horizontal, ele adquire visão ampla de várias áreas, linguagens, bancos de dados, metodologias e até aspectos de negócios, o que permite integrar equipes e compreender o sistema como um todo. Já na dimensão vertical, ele se aprofunda em um campo específico, como segurança, nuvem ou microsserviços, garantindo domínio técnico e capacidade de decisão. Assim, o arquiteto modelo T equilibra amplitude e profundidade, unindo estratégia e especialização.

## Aula 29/09

### Circuit Breaker Pattern
É um padrão de design muito utilizado em sistemas distribuídos para aumentar a resiliência e evitar falhas em cascata. Inspirado no funcionamento dos disjuntores elétricos, esse padrão atua como um monitor que identifica quando uma operação remota ou serviço está falhando repetidamente. Quando um número pré-definido de falhas consecutivas é atingido, o circuito é “aberto”, interrompendo temporariamente as chamadas ao serviço problemático. Durante esse período, as requisições são rejeitadas rapidamente, evitando o consumo excessivo de recursos e permitindo que o serviço tenha tempo para se recuperar. Após um tempo determinado, o circuito entra em um estado “semi-aberto”, testando se o serviço voltou ao normal; se sim, o circuito é fechado e as chamadas são liberadas novamente. Assim, o Circuit Breaker melhora a estabilidade e a tolerância a falhas de sistemas distribuídos, evitando que falhas isoladas comprometam toda a aplicação.
### Ele opera em três estados principais: Closed, Open e Half-Open.
- No estado Closed (fechado), o circuito funciona normalmente, permitindo que as requisições sejam enviadas ao serviço remoto. Durante esse estado, o padrão monitora o sucesso ou falha dessas requisições. Se o número de falhas consecutivas ultrapassar um limite pré-definido, o circuito muda para o estado Open.
- No estado Open (aberto), o circuito bloqueia imediatamente as requisições, evitando novas tentativas ao serviço problemático. Isso protege o sistema contra o consumo excessivo de recursos e impede que falhas continuem se propagando. O circuito permanece aberto por um tempo determinado, chamado de período de espera.
- Após esse intervalo, o circuito entra no estado Half-Open (meio-aberto), onde libera um número limitado de requisições para testar se o serviço externo voltou ao normal. Se essas tentativas forem bem-sucedidas, o circuito retorna ao estado Closed, restabelecendo o fluxo normal de requisições. Caso contrário, volta para o estado Open, reiniciando o ciclo.
  
Dessa forma, o Circuit Breaker assegura uma comunicação mais estável e eficiente em sistemas distribuídos, melhorando a tolerância a falhas e evitando que problemas isolados comprometam a aplicação inteira.

## Aula 06/10

### Definições das características arquiteturais:
As características arquiteturais (também chamadas de atributos de qualidade ou quality attributes) são propriedades não funcionais que determinam o comportamento e a qualidade de um sistema de software. Enquanto os requisitos funcionais descrevem o que o sistema faz, as características arquiteturais descrevem como ele faz, influenciando diretamente as decisões de projeto e a estrutura da arquitetura.

Essas características são fundamentais porque determinam a capacidade do sistema de atender às expectativas de desempenho, segurança, manutenibilidade, disponibilidade, escalabilidade e usabilidade, entre outras. Elas não se manifestam em funcionalidades específicas, mas em comportamentos emergentes do sistema como um todo.

O livro destaca que as características arquiteturais devem ser explicitamente identificadas, documentadas e priorizadas desde as fases iniciais do desenvolvimento, pois impactam a escolha de tecnologias, padrões de projeto e a própria organização dos componentes.
Por exemplo, uma aplicação que prioriza desempenho pode exigir cache, balanceamento de carga e processamento assíncrono; já uma aplicação que prioriza segurança pode adotar autenticação forte, criptografia e isolamento de componentes.

Os autores classificam as características em três categorias principais:
- Executáveis em tempo de execução – como desempenho, disponibilidade, segurança e escalabilidade.
- Relativas à evolução do sistema – como manutenibilidade, modularidade, testabilidade e extensibilidade.
- De negócio – como tempo de mercado, custo de desenvolvimento e reutilização.

## Aula 07/10

### CQRS
CQRS (Command Query Responsibility Segregation) é um padrão arquitetural que propõe a separação das responsabilidades de leitura (queries) e escrita (commands) em um sistema. Em vez de usar o mesmo modelo para ambas as operações, como em arquiteturas CRUD tradicionais, CQRS divide esses dois aspectos, permitindo otimizações específicas para cada um.

O modelo de escrita foca em manter a integridade dos dados e aplicar as regras de negócio, enquanto o de leitura é otimizado para desempenho e consultas eficientes. Em muitos casos, os dados de leitura são atualizados de forma assíncrona com base em eventos disparados pelas operações de escrita, o que pode gerar uma consistência eventual.

Esse padrão é especialmente útil em sistemas complexos, com regras de negócio robustas e grande volume de leitura. Ele oferece vantagens como escalabilidade, desempenho aprimorado e melhor organização do código. No entanto, também traz desafios, como aumento da complexidade, necessidade de sincronização entre os modelos e custo de manutenção maior.

Por isso, CQRS deve ser adotado com critério, especialmente quando os benefícios superam os custos de implementação.

## Aula 13/10

### Retry Pattern 
É um padrão usado para aumentar a resiliência de sistemas distribuídos, permitindo que operações com falhas temporárias sejam tentadas novamente antes de serem consideradas como falhas definitivas. Esse padrão é útil quando há falhas transitórias, como problemas de rede ou serviços externos instáveis, que podem ser resolvidas com uma nova tentativa.

Estratégias Comuns:
- Tentativas fixas: O sistema tenta um número predefinido de vezes.
- Backoff exponencial: O tempo entre as tentativas aumenta exponencialmente para reduzir a sobrecarga no sistema.
- Jitter: Introduz uma variação aleatória no tempo de espera entre tentativas para evitar picos simultâneos de reconexões.
- Circuit Breaker combinado: Pode ser usado junto com o Retry Pattern para evitar tentativas contínuas em caso de falhas graves.

Benefícios:
- Resiliência: Permite que o sistema se recupere de falhas temporárias.
- Redução de erros do usuário: Melhora a experiência, tentando novamente em vez de retornar erros.
- Menor sobrecarga: Com backoff exponencial e jitter, o sistema evita sobrecarregar-se.

Desafios:
- Controle de recursos: Muitas tentativas podem aumentar a carga no sistema.
- Falhas permanentes: O padrão não resolve falhas não transitórias.
- Complexidade: Implementar de forma eficiente requer cuidados, como definir os limites e tempos adequados.

## Aula 20/10

### Estilo de Arquitetura em Camadas 
É um estilo de arquitetura de software que organiza o sistema em camadas, onde cada camada tem uma responsabilidade específica, permitindo melhor modularização e manutenção.

Camadas Comuns:
- Camada de Apresentação: Interage com o usuário, exibindo dados e recebendo entradas.
- Camada de Lógica de Negócio: Contém a lógica central e regras de negócio.
- Camada de Acesso a Dados: Gerencia a comunicação com o banco de dados.
- Camada de Infraestrutura (opcional): Lida com aspectos como segurança e comunicação externa.

Vantagens:
- Modularidade e Reusabilidade: Facilita a manutenção e permite reutilizar componentes.
- Escalabilidade e Facilidade de Testes: Camadas podem ser escaladas e testadas independentemente.

Desvantagens:
- Sobrecarga de Comunicação: A interação entre camadas pode impactar a performance.
- Rigidez: Mudanças podem exigir modificações em várias camadas.
