package org.williams.contabancaria;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o número da conta ! :");
        numero = Integer.parseInt(sc.nextLine());
        System.out.print("Por favor, digite o número da Agência ! :");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente ! :");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo da conta ! :");
        saldo = Double.parseDouble(sc.nextLine());
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque.");
        sc.close(); //Encerra o programa


    }
    
}
