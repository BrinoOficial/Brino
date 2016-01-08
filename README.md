#Brino

##Tipos de Dados:    
 * `Numero`: valores n�mericos inteiros at� +- 32767 (`int`)    
 * `NumeroDecimal`: valores n�mericos com casas decimais (`float`)    
 * `NumeroLongo`: valores n�mericos inteiros at� 2147483647 (`long`)    
 * `NumeroLongo NumeroLongo`: valores n�mericos at� 9223372036854775807 (`long long`)   
 * `Palavra`: sequ�ncia de caracteres (`String`)   
 * `Condicao`: valor bin�rio **Verdadeiro** ou **Falso** (`boolean`)    
   
 ### Modificadores
 * `Modulo`: utiliza somente o valor e ignora o sinal do n�mero (`unsigned`)
 * `Constante`: indica que a vari�vel possui valor constante, ou seja, n�o mudar� durante a execu��o (`const`)  
    

##Fun��es:    

###Arduino    
 * `soar(Numero pino, Numero frequencia, Numero duracao)`: toca determinada nota no alto-falante conectado ao Pino durante o periodo definido(opcional) (`tone()`)     
 * `pararSoar(Numero pino)`: interrompe a nota que est� sendo tocada no pino fornecido (`noTone`)     
 * `esperar(Numero milis)`: espera "milis" milissegundos (`delay()`)      
 * `proporcionar()`: faz uma regra de tr�s com os valores fornecidos (`map()`)    
 * `definir`: define uma constante que ser� utilizada durante o programa (`\#define`)      
 * `usar`: importa as depend�ncias do programa como *libraries* externas (`\#include`)     
     

###USB    
 * `USB.conectar(Numero TaxaDeTransmissao)`: configura a comunica��o serial pela porta USB com a a taxa de transmiss�o fornecida como argumento. Padr�o 9600. (`Serial.begin(baudrate)`)    
 * `USB.enviar(Palavra mensagem)`:envia a Palavra fornecida para o monitor serial conectado (`.print(String message)`)    
 * `USB.enviarln(Palavra mensagem)`:envia a Palavra fornecida para o monitor serial conectado e pula uma linha (`.println(String message)`)    
    

###Pino    
 * `Pino.definirModo(Numero pino, Modo)`: define o modo da porta digital fornecida(apenas o n�mero) para o modo fornecido (**Entrada** ou **Saida**) (`pinMode(int pin, [OUTPUT ou INPUT])`)      
 * `Pino.escrever(Pino, saida)`: escreve o valor fornecido na porta fornecida (`analogWrite(int pin, int value)` ou `digitalWrite(int pin, [HIGH ou LOW])`)        
 * `Pino.ler(Pino)`: l� o valor da porta especificada (analogRead ou digitalRead)    
 * `Pino.ligar(Pino)`: liga o pino digital (digitalWrite(int pin, HIGH))    
 * `Pino.desligar(Pino)`: desliga o pino digital(digitalWrite(int pin, LOW))    
 * Pinos digitais: `D.num`, `Digital.num`, `Dnum` ou `num`    
 * Pinos anal�gicos: `Anum`, `Analogico.num`
 * Valores Digitais: `Ligado` ou 1,`Desligado` ou 0.
     

##Libraries inclusas no IDE (devem ser declaradas com `usar`):    
     

###Memoria (EEPROM)    
 * `Memoria.ler(Numero endereco)`: l� o byte do endere�o fornecido (`EEPROM.read()`)    
 * `Memoria.escrever(Numero endereco, byte dado)`: escreve o byte fornecido no endere�o fornecido (`EEPROM.write()`)     
 * `Memoria.tamanho()`: retorna o tamanho da mem�ria do arduino (`EEPROM.length()`)    
 * `Memoria.formatar()`: apaga todos os dados da mem�ria do arduino    
    

###LCD (LiquidCrystal)             
 * `LCD <nome>(Numero RS, E, D4, D5, D6, D7)`: cria o objeto LCD para ser utilizado (`LiquidCrystal <name>()`)    
 * `<nome>.conectar(Numero colunas, Numero linhas)`: inicia a comunica��o com o lcd com o n�mero de linhas e colunas definido (`<name>.begin()`)    
 * `<nome>.enviar(Palavra mensagem)`: envia a palavra para o LCD (`<name>.print()`)    
 * `<nome>.escrever(byte b)`: escreve em hexadecimal o byte enviado para o LCD (`<name>.write`)    
 * `<nome>.posicao(Numero coluna, Numero linha)`: posiciona o cursor na linha e coluna definidas (`<name>.setCursor()`)    
 * `<nome>.limpar()`: apaga o que est� escrito no LCD (`<name>.clear`)
     
###Servo          
 * `Servo <nome>`: cria o objeto servo para ser utilizado (`Servo <name>`)         
 * `<nome>.conectar(Pino digital)`: conecta o servo � porta digital (`<name>.attach()`)     
 * `<nome>.escreverAngulo(Numero angulo)`: posiciona o servo no �ngulo fornecido(`<name>.write`)     
 * `<nome>.escreverMicros(Numero micros)`: define a duracao em microsegundos do pulso para controlar o servo de rota��o cont�nua (`<name>.writeMicroseconds()`)      
 * `Servo.frente`(1700), `Servo.tras`(1300) e `Servo.parar`(1500): constantes de pulso para controle de servos de rota��o cont�nua.     
    

##Outras palavras-chaves     
     

###Fun��es necess�rias a um c�digo Brino     
 * `Configuracao(){}`: parte do c�digo que ser� executado uma vez e que prepara o sistema para o resto do programa (`void setup(){}`)     
 * `Principal(){}`: c�digo principal que ser� executado repetidas vezes (`void loop(){}`)    
     

###Instru��es de Controle    
 * `para (dado d; dado <comparador> referencia; incremento) faca{}`: repete o bloco de c�digo de acordo com as condi��es descritas(`for(){}`)     
 * `se (dado <comparador> referencia) faca{}`: realiza o bloco de c�digo se o resultado da compara��o for Verdadeiro (`if (){}`)    
 * `senao faca{}`: realiza o bloco de c�digo caso o resultado do "se" relacionado seja Falso (`else{}`)    
 * `enquanto (dado <comparador> referencia) faca{}`: realiza o bloco de instru��es enquanto o resultado for Verdadeiro (`while(){}`)     
     

###Comparadores    
 * `==`: igual a     
 * `<`: menor que    
 * `<=`: menor que ou igual     
 * `>`:maior que     
 * `>=`: maior que ou igual    
 * `!=`: diferente de 
 * `<condicao1> e <condicao2>`: retorna Verdadeiro se ambas as condi��es forem verdadeiras (`&&`)     
 * `<condicao1> ou <condicao2>`: retorna Verdadeiro se uma ou outra ou ambas as condi��es forem verdadeiras (`||`)    
     

###Palavras-chaves    
 * `SemRetorno`: utilizada para declarar o tipo de retorno de uma fun��o como vazio (`void`)    
 * `responder dado`: indica o dado que ser� retornada pela fun��o caso n�o seja SemRetorno (`return`)     
 * `<native>`: indica que a linha � composta por c�digo nativo do arduino    