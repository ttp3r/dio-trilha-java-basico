# Anatomia das Classes 1

> Uma classe bem estruturada não quer guerra com ninguém.
> 

*Quando a gente consegue montar um arquivo Java, que é a essência de todo o código fonte da linguagem (classes), cuja estrura contem coerência, padrões e outros requisitos, percebemos que fica mais sutil para ser compreendido, dar manutenção e desfrutar dos recursos.*

- A escrita de códigos de um programa é feita através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos ⇒ caracterização das nomenclaturas.
- É muito comum mesclarmos expressões do idioma inglês com o nosso vocabulário. Existem projetos que recomendam toda a implementação do programa na lingua inglesa.

**Sintaxe de declaração de uma nova classe:**

```java
public class MinhaClasse {

	// SEU CÓDIGO AQUI
}
```

⇒ inicamos o projeto criando um *arquivo.java*, que tem um padrão:

- nome do arquivo, normalmente do *public class*:
- este nome deve ser coerente com a expressão que vamos escrever, o conteúdo que vamos representar. Todo este conteúdo fica inserido dentro das {}.
- métodos
- variáveis
- expressões

### **Criando uma classe inicial**

**Passo-a-passo realizado:**

1. instalar extensão java no vs code
2. no vs code > ctrl + shift + p para iniciar projeto
3. escolher opção create java project
4. escolher onde salvar o repositório na máquina
5. dar um nome ao projeto utilizando convenção de letras minúsculas e traços para separar palavras

*Todo o código será consistido no arquivo/pasta src que já cria uma classe chamada App.java que na hora da compilação se converte em uma classe e que já traz uma estrutura public static.*

1. excluir o arquivo App.java
2. criar novo arquivo ‘MinhaClasse.java’ > convenção de todos os arquivos/classes sempre começar com a primeira letra das palavras maiúsculas. > quando formos criar métodos e variáveis, esta regra vai sofrer alterações.

*Como foi sugerido, a maioria das classes vão começar com esse prefixo:*

*public class + nome da minha classe + bloco de código entre chaves*

1. aspectos: o que escrever dentro de uma linguagem java? Se a minha classe é executável, ou seja, tem a capacidade de realizar a inicialização do projeto de forma independente, ela precisa ter um método principal, especial, denominado método main. > este método tem uma característica única na inicialização e segue o seguinte padrão:

```java
public static void main (String [] args){

}
```

*void significa que não vai retornar nada; main é o nome do método; espera um parâmetro especial do tipo string; a gente determina este parâmetro como um array, representado pelos colchetes, chamado args. Dentro deste método também haverá um corpo, que é representado pelas chaves > tudo que for escrito dentro deste corpo também pertence à classe, mas a fronteira de método determina se será inicializado ou não, o que for escrito no corpo do método main só vai existir dentro do método main.*

*parâmetro string: além das classes que a gente cria, a linguagem já tem as classes que representam tipos, funções, datas, operações, etc.*

*toda classe precisa existir dentro do arquivo src do seu projeto.*

---

# Anatomia das Classes 2

> Padrão de nomenclatura: tão importante quanto o algoritmo no qual será implementado.
> 

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos abaixo:

- **Arquivo .java:** todo arquivo .java deve começar com a letra maiúscula. Se a palavra for composta, a segunda palavra também deve começar com a letra maiúscula, exemplo:

 

```java
Calculadora.java, CalculadoraCientifica.java
```

- **Nome da classe no arquivo:** a classe deve possuir o mesmo nome do arquivo .java, exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

- **Nome de variável:** toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra das demais palavras deve ser maiúscula. Exemplo:

```java
ano, anoFabricacao
```

O nome dessa prática para nomear variáveis dessa forma se chama “camelCase”.

Para declarar uma variável, nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras de linguagem:

1. deve conter apenas letras, _, $ ou os dígitos de 0 a 9
2. deve obrigatóriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número
3. deve iniciar com uma letra minúscula (boa prática)
4. não pode conter espaços
5. não pode usar palavras-chave da linguagem
6. o nome deve ser único dentro de um escopo

```java
// Declaração inválida de variáveis

int numero&um = 1;
int 1numero = 1;
int numero 1 = 1;
int long = 1;

// Declaração válida de variáveis

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre representará ************Brasil************ e nunca mudará seu valor, logo, determinamos como escrito no código abaixo:

```java
final String BR = "Brasil";
final double PI = 3.14;
final int ESTADOS_BRASILEIROS = 27;
final int ANO_2000 = 2000;
```

utilizar a expressão final; representar a variável toda em letras maiúsculas.

---

# Anatomia das Classes 3

Declaração de variáveis e métodos

> Conseguimos identificar através de algumas estruturas, quando estamos nos referindo a uma variável ou a um método na aplicação.
> 
- Toda variável na linguagem Java tem necessidade de tipo e nome bem definidos e, opcionalmente um valor.

```java
// Exemplo

int idade = 23;
double altura = 1,62;
Dog spike; // aqui a variável spike não tem valor
boolean verdadeira = true;
```

- Métodos têm estruturas bem simples:
1. tipo de retorno 
2. nome de objetivo no infinitivo (proposta bem definida)
3. parâmetros (opcional)

```java
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
// Exemplo

int somar (int numeroUm, int numero22);

String formatarCep (long cep)
```

---

# Anatomia das Classes 4

> A medida que a gente vai implementando alguns projetos, os arquivos tendem a ter uma certa extensão de conteúdos, códigos e altoritimos. Por isso, utilizamos a estratégia de indentação ⇒ uma forma de tabular o código para que ele tenha uma compreeensão a nível de escopo da proposta de implementação. Aspecto relevante no que se refere a visualização e interpretação dos códigos.
> 
- Basicamente, **indentar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.
- Utilizar ctrl + K + ctrl + F para formatar as linhas selecionadas, ou ctrl + shift + I para formatar o documento.

---

# Anatomia das Classes 5

> A medida que o sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização desses arquivos através de pacotes (packages). Esta é uma forma de criar uma estrutura de subdiretórios (pacotes), para uma melhor organização dos arquivos.
> 
- Existe uma convensão desses sbdiretórios; analogia: assim como as empresas possuem segmentos (comercial, organizacional, opensource, etc), para os projetos existem finalidades. Grande parte dos projetos possuem estas propostas:

abrevia-se  com os prefixos = comercial como ***com***, organizacional como ***org***, open source como ***org*** ou ***opensource***

Imagine que a empresa referisa se chama HyperTech, seus projetos são comerciais. Então temos o seguinte prefixo da proposta/do projeto ⇒ o *********com********* + o nome da empresa + o nome da aplicação, demonstrado a seguir:

```java
com.hypertech.notification
```

a partir deste pacote, onde a identidade da empresa ganha ênfase, pode-se ter mais subpacotes com diferentes finalidades:

```java
com.hypertech.notification.app
com.hypertech.notification.modelo
com.hypertech.notification.util
com.hypertech.notification.service
```

---

# Anatomia das Classes 6

> Uma das maiores dificuldades na programação é escrever algoristmos legíveis a níveis que sejam compreendidos por todo o seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere, através de convenções, formas de escrita universal para as classes, atributos, métodos, variáveis, pacotes.
> 
- Java Beans é uma iniciativa conceitual da comunidade para que a gente possa ter uma estruturação da escrita, expressão das variáveis, classes, métodos etc, para que os códigos sejam o mais claro e coezo possível diante da proposta do algoritmo.
- Falando de variáveis, há algumas sugestões de nomenclatura:
1. uma variável precisa ser clara, sem abreviações ou definição sem sentido
2. uma variável é sempre no singular, exceto quando se referir a um array ou coleção
3. defina um idioma único para suas variáveis, se você for declarar variáveis em ingles, defina todas em inglês
4. **não recomendado**: 

```java
double salMedio = 1500,23; // variável abreviada de Salário Médio
String emails = jujuba@hotmail.com; // uso do plural desnecessário
String myName = "Joseph"; // se o idioma é pt-BR, mesmo que o valor seja em inglês, o ideal é que o tipo seja em pt-BR
```

1. ****************correto:****************

```java
double salarioMedio = 1500,23;
String [] emails = jujuba@hotmail.com;
String meuNome = "Joseph";
```

1. por mais que o código seja escrito em português, algumas bibliotecas contém métodos que serão chamados em inglês
- Métodos devem ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. A princípio, todas as letras que compõe o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra. Exemplo:

```java
somar (int n1, int n2) {}

abrirConexao () {}

concluirProcessamento () {}

findById (int id) {}

calcularImprimir () {} // há algo de errado, ele deveria ter uma única finalidade, afinal ele é um método calcular ou um método imprimir?
```

---

# Tipos e Variáveis

- Explorar os tipos de dados numéricos, inteiros, numéricos decimais, lógicos, caracteres e suas aplicabilidades.
- Diferença de variáveis e constantes.
- Objetos.

### Requisitos

JDK

IDE

Diretório do projeto

Integração com Github

## Criando o projeto

1. criar um repositorio no Github chamado dio-trilha-java-basico
2. selecionar opções de readme e .gitignore para java ao criar o repositório remoto
3. copiar link https do repositório remoto no github
4. ctrl + shift + p no vs code para iniciar novo projeto
5. pesquisar por create new java project
6. selecionar no build tools
7. selecionar a pasta destino no disco rígido
8. nomear o projeto
9. colar o link do projeto copiado do Github
10. no ícone do git no vs code, determinar a pasta de arquivo json como gitignore
11. renomear o arquivo App.java para o nome do projeto > TiposVariaveis.java
12. escrever a mensagem do commit
13. commitar

---

- Após configurar a IDE e validar a integração ao repositório do Github, vamos entender a proposta de tipos e variáveis na linguagem.
- O que são tipos de dados?

Palavras reservadas para a representação dos tipos de dados básicos, que precisam ser manipulados para a construção de um programa;

Estes oito tipos de dados são conhecidos como tipos primitivos (primitive types):

1. int
2. byte
3. short
4. long
5. float (partes fracionárias)
6. double (partes fracionárias)
7. boolean
8. char

Estes tipos não são considerados objetos, portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (memory stack).

**Tabela de Tipos Primitivos e seus valores (capacidades)**

| Tipo | Memória | Valor mínimo | Valor máximo |
| --- | --- | --- | --- |
| byte | 1 byte | -128 | 127 |
| short | 2 byte | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| float | 4 bytes | -1,4024E-37 | 3.40282347E+38 |
| char |  | 0 | 65535 |
| double | 8 bytes | -4,94E307 | 1.79769313486231570E+10B |
| long | 8 bytes | -9.223.372.036.854.770.000 | 9.223.372.036.854.770.000 |
| boolean |  | false | true |

> Por mais que a gente tenha 4 tipos númericos inteiros, é muito comum usarmos *int* nas aplicações por uma questão de compatibilidade da jvm, ela sempre busca converter tipos literais para *int*. ********Double******** também é mais comum em casos fracionários.
> 
- Declaração de Variáveis

Variável é uma identificação de um epaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipos de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempr é:

```java
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
```

Por padrão, variáveis de tipo numérico cujos valores não são declarados recebem o valor = 0; variáveis de tipo lógico que não recebem valor costumam ser falsas por padrão.

Obs.: a linguagem Java não reconhece o ponto (.) para declaração de variável com valor milhar. Exemplo:

```java
double salarioMinimo = 2.500; // desta forma, o valor é considerado pela linguagem como 2,5.
double salarioMinimo = 2500; // desta forma, o valor se torna dois mil e quinhentos.
double salarioMinimo = 2500.33 // se houver centavos, aí sim adiciona-se o ponto. Esta é a convenção americana.
```

Atenção:existe algumas peculiaridades ao trabalhar com alguns tipos específicos, observe:

```java
public class TipoDados {
		public static void main(String [] args) {
			byte idade = 123;
			short ano = 2021;
			int cep = 21070333; // se começar com zero, pode ser que seja necessário utilizar outro tipo, pois o Java não armazena números que começam com zero para o tipo inteiro, provavelmente teria que usar uma string.
			long cpf = 9876632197L; // se começar com zero, idem ao comentário de cima.
			float pi = 3.14F; // se não utilizar um F no final (maiúsculo ou minúsculo), vai dar erro de compilação, pois o Java vai entender como double.
			double salario = 1275.33;
		}
}
```

Observe que o tipo *long*  precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

> Muitas vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação, mas cuidado, Java é uma linguagem fortemente tipada.
> 

```java

// problema encontrado pela IDE
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;

/* o 'numeroNormal', por mais que agora seja 1,
 em algum momento pode se tornar superior aos 32 mil
que o tipo short comporta, por isso a linguagem não permite.

adaptação sugerida pela IDE */
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;  // utilizado o recurso casting
```

**Casting:** recurso que pega um tipo mais abrangente e converte para um tipo mais específico porque é o tipo correspondente, realizando uma adaptação. Não é coerente fazer isso com frequência, mas é como se a linguagem dissesse “se você quer colocar um valor com possível precisão maior para uma precisão menor, você precisa garantir que se acontecer algo inesperado, você esteja ciente.”

- Cada tipo de dado tem uma forma de declarar/atribuir seu valor:
1. se falamos de uma String, é preciso colocar entre aspas;
2. um inteiro utiliza o valor literal numérico;
3. double e float exigem pontuação para separar o valor decimal da expressão numérica - convenção americana;
4. utilizando caractere, utilizamos aspas simples. Ele permite um único caractere;
5. o valor booleano é atribuído utilizando os valores literais false ou true.
6. classes (representam tipos de variáveis), precisa ser antecedida com a palavra-chave *new,* que deve preceder o *Nome* da classe e informar os parâmetros de inicialização, que são os construtores ().
- Quando queremos definir um valor que nunca poderá ser alterado no decorrer da aplicação:

> **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada *final,* seguida do tipo. Por convenção, as constantes sempre são escritas em caixa alta.
> 

```java
// Exemplo de variáveis

int numero = 5;
numero = 10;

// Exemplo de constantes

final int NUMERO = 5;
final int NUMERO2 = 10;
```

---

# Operadores

> Operadores são símbolos especiais que utilizamos para operações e expressões matemáticas. Eles possuem significado próprio para a linguagem.
> 

Pré-requisitos:

1. diretório do projeto definido;
2. integração com Github;
3. Noções em declaração de variáveis.
- A proposta dos operadores é realizar as operações de um programa com a finalidade de atingir determinado resultado.

## Operadores de atribuição

- Representados pelo símbolo de igualdade =.
- O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em Java, definimos um tipo, nome e opcionalmente atribuimos um valor à variável através do operador de atribuição.
- Operadores aritméticos são utilizados para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa:

adição (+)
subtração (-)
multiplicação (*)
divisão (/)
módulo (%)

Quando o operador de adição é utilizado entre variáveis do tipo string, ele realiza a concatenação de textos.

## Operadores Unários

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar e inverter valores numéricos e booleanos.

- Operador unário de valor positivo (+):

números são positivos sem esse operador explicitamente.

- Operador unário de valor negativo (-):

nega um npumero ou expressão aritmética.

- Operador de incremento de valor (++):

inrementa valor em 1 unidade

- Operador de decremento de valor (- -):

decrementa o valor em 1 unidade.

- Operador lógico de negação (!):

nega o valor de uma expressão booleana.

```java
public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
// Exemplo de operador unário de valor negativo.
```

O operador de negação não afetou o valor da variável principal, apenas fez efeito no momento da impressão.

- Incrementar é pegar um valor atual e aplicar uma nova atriuição desse valor, considerando que esse incremento é sempre um valor igual, de mesmo valor, exemplo de 2 em 2, 3 em 3 etc. Neste caso, temos um fluxo de repetição.

## Operadores Ternários

O operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valors. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrurura estará escrita numa única linha.

> É uma forma resumida para definir uma condição e escolher por um dentre dois ou mais valores.
> 

O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:

```java
<Expressão Condicional (booleana)> ? <caso condição seja true> :
<caso condição seja false>
```

Exemplos:

```java
//classe Operadores.java
int a, b;
String resultado;

a = 5;
b = 6;

//Exemplo de condicional utilizando uma estrutura if/else
if (a==b)
	resultado = "verdadeiro";
else
	resultado = "falso";
```

## Operadores Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, maior, menor, menor ou igual ou maior ou igual ao da direita, retornando um valor booleano como resultado.

- ‘==’ quando desejamos verificar se uma variável é igual a outra;
- ‘!=’ quando desejamos verificar se uma variável e diferente da outra;
- ‘>’ quando desejamos verificar se uma variável é maior que a outra;
- ‘<’ quando desejamos verificar se uma variável é menor que a outra;
- ‘< =’ quando desejamos verificar se uma variável é menor ou igual a outra;
- ‘> =’ quando desejamos verificar se uma variável é menor ou igual a outra.

```java
//class Operadores.java
				int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("Número 1 é diferente do número 2? " + "Resposta: " + simNao);
```

- Com o "==" também conseguimos verificar conteúdos, mas para comparar objetos/strings, é recomendado utilizar o método 'equals' ao invés de "==” ⇒ o retorno é boolean

```java
public class OperadoresRelacionais {
    public static void main(String[] args) {
		String nomeUm = "Talita";
		String nomeDois = new String ("Talita");

		System.ou.println(nomeUm.equals(nomeDois));
}
```

## Operadores Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

- && ⇒ operador lógico ‘E’
- || ⇒ operador lógico ‘OU’

Existem duas condições, e elas podem ser uma **************************************variável booleana**************************************  ou uma expressão usando os **operadores relacionais.**

```java
public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }

        System.out.println("Fim!");
```

# Métodos

> Todas as ações das aplicações na linguagem Java são consideradas métodos.
> 

Pontos de reflexão:

- qual a proposta/finalidade do método?
- Algum tipo de retorno é esperado após executar o método? Qual?
- será necessárop parâmetros para a execução do método? Quais?
- o método possui o risco de apresentar alguma exceção?
- qual a visibilidade do método?

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro das nossas classes.

## Critério de nomeação de métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo
- Seguir o padrão camalCases, todas as letras minpusculas com exceção da primeira letra da segunda palavra;
- Clareza e precisão na expressão e estruturação do código;
- Caso o método não retorne nenhum valor (int, long, double, objeto etc), ele será representado pela palavra-chave **********void**********.

```java
somar (int n1, int n2) {}

abrirConexao() {}

concluirProcessamento() {}

findById (int id) {}

calcularImprimir() {} // conflito de responsabilidade. Afinal a finalidade dele é calcular ou imprimir? Deve ter apenas uma finalidade/ação.
```

Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe.

```java
public class Metodos {
    public static void main(String[] args){

        public double somar (int num1, int num2){
            //LÓGICA - FINALIZADE DO MÉTODO
            return ...;
        }

        public void imprimir(String texto){
            //LÓGICA - FINALIDADE DO MÉTODO
						//AQUI NÃO PRECISA DO RETURN
						//POIS NÃO SERÁ RETORNADO NENUM RESUTADO
        }
				
					//throws Exeption: indica que o método ao ser utilizado
					//poderá gerar uma exceção
					public double dividir (int dividento, int divisor) throws Exeption{}
			    } 
}
```

- Um método que recebe muitos parâmetros normalmente deve se tornar a abstração de um objeto, criando uma classe que já traz todos as características e será necessário passar um único parâmetro.

# Exercitando

Vamos criar um exemplo de uma classe para representar uma SmarTV onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
2. Nossa TV poderá ligar e desligar e assim mudar o estado;
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.