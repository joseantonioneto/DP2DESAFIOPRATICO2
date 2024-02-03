# DP2DESAFIOPRATICO2
Repositório criado para inserir a documentação do desafio proposto na questão 1.

A integridade conceitual é crucial para a coerência em sistemas de software, facilitando sua compreensão pelos usuários. Sua ausência dificulta o trabalho da equipe de desenvolvimento, principalmente em termos de manutenção e evolução do sistema, afetando negativamente na experiência do usuário. Sites com informações confusas, dispostos em layouts bagunçados, sem integração dos elementos (textos, imagens, etc), são alguns dos efeitos da falta de integridade conceitual no projeto.

O ocultamento de informação destaca a importância de dividir sistemas em módulos para facilitar sua compreensão e flexibilidade. Essa modularização pode ser feita ainda em partes menores, à níveis de métodos e funções ou à níveis maiores, para pacotes e componentes. Este conceito permite que o trabalho seja realizado de forma paralela, por equipes diferentes, com features diferentes do mesmo sistema. Ao particionar um sistema em fragmentos menores, o gerenciamento sobre cada tarefa se torna mais fácil de acompanhar, além de contribuir também para minimizar bugs.

A coesão, na implementação de classes, deve implantar uma única classe ou serviço. Cada classe deve ter uma única responsabilidade no sistema. À níveis menores, o conceito de coesão se aplica também à métodos e funções. Um sistema coeso facilita a implementação de uma classe, à partir do momento que ela é única. Além disso, facilita o reuso, uma vez que é mais simples reusar e testar uma classe coesa do que uma com várias responsabilidades.

O acoplamento refere-se à força da conexão entre duas classes, dividindo-se em acoplamento aceitável e acoplamento ruim. No acoplamento aceitável, uma classe usa apenas os métodos públicos de outra classe, cuja interface é estável, minimizando mudanças impactantes. Já o acoplamento ruim não é mediado por interfaces, portanto, deve ser evitado, pois irá propagar a mudança entre classes. Coesão e acoplamento são conceitos que caminham juntos e deve-se haver a tentativa ao máximo de manter a coesão entre as classes e evitar o acoplamento entre elas. 

O princípio de responsabilidade única (S de SOLID) está ligado diretamente à coesão, como propriedade de projeto. Como vimos, a coesão trata de que uma classe deve ter uma única responsabilidade e agora acrescentamos que deve haver apenas uma motivação para a modificação de uma classe. Ao aplicar este conceito no sistema, o reuso se torna mais fácil, uma vez que cada classe poderá ser usada com outras classes de interfaces diferentes no projeto. 

O Princípio de aberto/fechado defende que os objetos devem estar abertos à extensões, mas fechados à modificações. Ou seja, a classe deve ser flexível e extensível, mas sem sofrer modificações.

O princípio da substituição de Liskov estabelece diretrizes para a redefinição de métodos em classes filhas em relação às classes base. Ou seja, cada classe filha deve ser substituível pela sua classe pai. Assim, ele promove a consistência e a integridade das hierarquias de classes, mantendo a coerência do comportamento esperado mesmo com a substituição de implementações específicas.

O princípio de segregação de interfaces, assim como o de responsabilidade única, também está ligada à coesão. Interfaces devem ser pequenas, coesas e específicas. Um cliente não deve ficar dependente de módulos que ele não utiliza, mantendo-o limitado somente às interfaces que ele irá utilizar. Cada cliente poderá utilizar módulos diferentes em uma mesma aplicação, então este conceito é importante na limitação de acesso ao que interessa para cliente.

O princípio da inversão da dependência diz que as entidades devem depender das abstrações e não das implementações. Em termos práticos, clientes devem depender das abstrações, ou seja, interfaces, ao invés de abstrações (classes).

O princípio de Demeter, também conhecido como lei do menor privilégio, defende a redução de acoplamento entre módulos e para isso, deve seguir algumas diretrizes: um método só deve interagir com objetos dentro de sua classe, de objetos passados como parâmetro, de objetos criados pelo próprio método e de atributos de classe do método. Este princípio traz algumas vantagens ao sistema, como a modularização e a diminuição de dependência de outras partes do sistema, sendo mais fácil realizar a manutenção e evoluir com o código.

