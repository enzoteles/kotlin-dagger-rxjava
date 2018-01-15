# kotlin-dagger-rxjava

  Esse projeto tem o objetivo de ajudar as pessoas que estão começando a trabalhar com kotlin, dagger e rxjava, utilizamos uma padrão de projeto de arquitetura chamado MVP, para facilitar a manutenção do código e facilitar na inserção de módulos de teste ou rede sociais futuramente, podem baixar e utilizar facilmente em projetos pessoais e projetos profissionais, fácil de entender e fácil de dar manutenção.

## kotlin
  
  Kotlin é uma linguagem da JetBrains, famosa por suas IDE's (RubyMine, IntelliJ, PhpStorm, etc), que foi construída para ser usada internamente pela empresa e foi pensada visando melhor legibilidade, produtividade e suprir limitações que a JetBrains vinha enfrentando com Java.
  Kotlin é a nova linguagem de programação que tem dado de falar na actualidade, foi criado pela jetbrains e teve 6 anos de desenvolvimento (2010–2016), pelos anos de desenvolvimento pode se perceber que não é uma linguagem que surge como uma brincadeira, mas sim é algo estável e sério.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/kotlin-primeiros-passos-b9035259e63a
  
  https://medium.com/kotlin-para-android/introdu%C3%A7%C3%A3o-a-kotlin-51a4355f3bc8
  
  http://blog.triadworks.com.br/uma-breve-introducao-a-kotlin
  
  esse link foi onde turbinei meu aprendizagem em kotlin
  
  https://www.youtube.com/watch?time_continue=1&v=FHZ6bI3zb4M
  
  
  ## Dagger 2
  
  O Dagger 2 é um framework mantido pela google que tem por objetivo realizar a injeção de dependência em projetos Android e Java. Ele foi criado a partir do Dagger 1 que foi desenvolvido pela Square.
  Importante ressaltar que o Dagger é para o Java, a Injeção de Dependência é um design pattern de programação, para qualquer linguagem.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/introdu%C3%A7%C3%A3o-ao-dagger-2-56d193118a6c
  
  https://www.thiengo.com.br/injecao-de-dependencia-com-a-lib-dagger-2-no-android
  
  https://www.concrete.com.br/2016/08/17/dagger-2-um-ano-depois/
  
  ## RxJava
  
  Programação Reativa é descrita simplesmente como programação utilizando um fluxo de dados assíncrono. Porém, este não é um novo conceito, outros padrões também utilizam esse significado.
  A RxJava possui características interessantes como facilidade de controlar concorrência, de forma a melhorar o uso do poder de processamento dos seus servidores; facilidade na execução condicional de tarefas assíncronas; melhoria quanto a evitar o problema de uso de vários callbacks (evitar o uso excessivo do padrão Observer) e abordagem reativa.
  
  https://www.devmedia.com.br/programacao-reativa-com-a-biblioteca-rxjava/33651
  
  https://medium.com/@spparks_/rxandroid-introdu%C3%A7%C3%A3o-b%C3%A1sica-primitivos-rxjava-599029ec1595
  
  https://www.infoq.com/br/presentations/programacao-reativa-com-rx
  
  # Projeto Kotlin
  
  Nesse projeto estamos consumindo desse json expecificado no link:
  
  https://api.androidhive.info/contacts/
  
  Nesse projeto estamos trabalhando com 5 pacotes com suas respectivas classes, conforme mostrado na figura abaixo:
  
  ![captura de tela de 2018-01-15 17-44-30](https://user-images.githubusercontent.com/5742609/34959125-138a84e2-fa1c-11e7-9cf4-46c3a2096089.png)
  
  Aqui criamos a classe MainModule do dagger na versão do kotlin conforme a figura abaixo:
  
  ![captura de tela de 2018-01-15 17-50-47](https://user-images.githubusercontent.com/5742609/34959215-a87da58e-fa1c-11e7-82dd-8035fc5026fd.png)
  
  Essa é a inteface que se comunica com o módulo do dagger confome abaixo:
  
  ![captura de tela de 2018-01-15 17-52-27](https://user-images.githubusercontent.com/5742609/34959313-19f0eb22-fa1d-11e7-966e-04f4a85e1ec3.png)

 E na MainActivity , específico no onCreate instanciamos o presenter como o dagger conforme a figura abaixo:
 
 ![captura de tela de 2018-01-15 17-56-10](https://user-images.githubusercontent.com/5742609/34959490-e1b45dec-fa1d-11e7-89c3-aa295d63e965.png)

e com isso chamaos o método callPresenter, nesse método instanciamos o interactor via dagger onde chamaos o método resultMsg 
conforme a figura abaixo: 

![captura de tela de 2018-01-15 18-00-57](https://user-images.githubusercontent.com/5742609/34959581-4b5db90a-fa1e-11e7-8a82-d50ca7674f30.png)

No interactor utilizamos o retrofit junto com rxjava e o padrão Observable para pegar a lista de contatos do Json e depois retorna a lista de contatos para o presenter. conforme a figura abaixo:

![captura de tela de 2018-01-15 18-05-25](https://user-images.githubusercontent.com/5742609/34959680-ba94dad8-fa1e-11e7-823f-f90ae1020111.png)

O presenter vai enviar a lista de contatos para a view no método resultMsgView que setará no adapter fazendo o bind dos componentes.

![captura de tela de 2018-01-15 18-08-25](https://user-images.githubusercontent.com/5742609/34959791-301c9f98-fa1f-11e7-9cf5-063df6aca16f.png)

O adapter eu mostro como setar os componentes e também como eu faço para implementar o onclick na versão do kotlin

![captura de tela de 2018-01-15 18-11-05](https://user-images.githubusercontent.com/5742609/34959867-856df2ee-fa1f-11e7-95e1-b9782bf376a7.png)

se vocês prestarem atenção no código ele está limpo e não tem todo aquela poluição do findviewbyid , por que estou utilizando o android extension, muito mais fácil e mais prático, mais informações no link abaixo:

https://developer.android.com/ndk/guides/audio/android-extensions.html

E na minha ContentActivity, eu pego o contato vindo do meu adapter através do onclick, e faço uma verificação se a intente está nula e depois seto os meus componentes da view utilizando o padrão android extension deixando o código mais limpo e fácil de entender conforme a figura abaixo:

![captura de tela de 2018-01-15 18-18-29](https://user-images.githubusercontent.com/5742609/34960110-a8c3fd96-fa20-11e7-81d2-f09c6f25cd3b.png)


E aqui chegamos ao fim do nosso sistema, um sistema simples mais muito prático para o aprendizado para quen queira começar a programar utilizando kotlin, aqui utilizamos vários framework que são utilizados em projetos profissionais, como rxjava, mvp, android extension, gradle , retrofit etc.

qualquer dúvida ou sugestão meu email é:
enzo.carvalho.teles@gmail.com








 
 

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



