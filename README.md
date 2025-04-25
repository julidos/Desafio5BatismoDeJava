<h1 align="center">💻 Desafio Java - Banco de Konoha 🏦</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue.svg" alt="Java Badge">
  <img src="https://img.shields.io/badge/Projeto-Concluído-success.svg" alt="Status Badge">
</p>

<p align="center">
  Desafio proposto durante o curso de Java, focado em abstração, interfaces e herança.
  <br>
  Simulação de um sistema bancário simples com diferentes tipos de contas.
</p>

<hr>

<h2>📋 Descrição do Desafio</h2>

<p>
  O desafio consistia em desenvolver um programa para gerenciar diferentes tipos de contas bancárias no <strong>Banco de Konoha</strong>. 
  A proposta principal era utilizar conceitos de <strong>POO</strong> como interfaces, classes abstratas, herança e polimorfismo. 
</p>

<h3>📌 Requisitos do Desafio:</h3>

<ul>
  <li>Criar uma <strong>interface</strong> chamada <code>Conta</code> com os métodos <code>consultarSaldo()</code> e <code>depositar(double valor)</code>.</li>
  <li>Criar uma <strong>classe abstrata</strong> chamada <code>ContaBancaria</code> que implementa a interface <code>Conta</code>.</li>
  <li>Adicionar um atributo <code>saldo</code> e um construtor para inicializá-lo.</li>
  <li>Implementar <code>consultarSaldo()</code> na classe abstrata.</li>
  <li>Deixar <code>depositar(double valor)</code> como método abstrato para ser implementado nas subclasses.</li>
  <li>Criar duas classes concretas:
    <ul>
      <li><code>ContaCorrente</code>: adiciona o valor ao saldo normalmente.</li>
      <li><code>ContaPoupanca</code>: adiciona o valor ao saldo com uma taxa de 1%.</li>
    </ul>
  </li>
</ul>

<h3>🎯 Desafio Extra</h3>
<ul>
  <li>Implementar um <code>enum</code> chamado <code>TipoConta</code> com os valores <code>CORRENTE</code> e <code>POUPANCA</code>.</li>
  <li>Modificar as classes para usar o enum.</li>
  <li>Criar uma classe <code>ContaBancaria</code> com método sobrecarregado para realizar transferências entre contas.</li>
</ul>

<hr>

<h2>🛠️ Como foi feito</h2>

<p>
  O projeto foi estruturado de forma clara, com cada classe e interface cumprindo seu papel. A classe abstrata <code>ContaBancaria</code> centraliza a lógica comum, enquanto as subclasses tratam os comportamentos específicos de cada tipo de conta.
</p>

<p>
  O enum <code>TipoConta</code> foi utilizado para reforçar a tipagem e facilitar a identificação das contas no sistema. Já a classe <code>ContaBancaria</code> foi responsável por intermediar transferências com uma sobrecarga de métodos para demonstrar polimorfismo.
</p>

<hr>

<h2>📁 Estrutura do Projeto</h2>

<pre>
├── Conta.java
├── ContaBancaria.java
├── ContaCorrente.java
├── ContaPoupanca.java
└── TipoConta.java
</pre>

<hr>

<h2>🚀 Como Executar</h2>

<ol>
  <li>Clone o repositório</li>
  <li>Abra em sua IDE Java preferida (IntelliJ, Eclipse, VSCode...)</li>
  <li>Compile e execute o método <code>main()</code> de teste (se aplicável)</li>
</ol>

<hr>

<h2>📌 Tecnologias Utilizadas</h2>

<ul>
  <li>Java 17</li>
  <li>POO (Programação Orientada a Objetos)</li>
</ul>

<hr>

<h2>🧠 Aprendizados</h2>

<p>
  Esse desafio foi essencial para consolidar os conceitos de abstração, uso de interfaces, herança e polimorfismo. Além disso, trabalhar com enums e sobrecarga de métodos trouxe uma visão mais ampla da linguagem.
</p>

<hr>

<h2>🤝 Contato</h2>

<p>
  Feito com 💙 por Juliano Oliveira. Entre em contato pelo GitHub ou LinkedIn!
</p>
