����   D N
      java/lang/Object <init> ()V	  	 
   pessoa/Pessoa nome Ljava/lang/String;	     idade I	     peso D	     altura	      java/lang/System out Ljava/io/PrintStream;      ! makeConcatWithConstants (D)Ljava/lang/String;
 # $ % & ' java/io/PrintStream println (Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Lpessoa/Pessoa; getNome ()Ljava/lang/String; setNome getIdade ()I setIdade (I)V getPeso ()D setPeso (D)V 	getAltura 	setAltura Calcula_imc (DD)D imc 
SourceFile Pessoa.java BootstrapMethods A IMC:  C
 D E F   G $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses J %java/lang/invoke/MethodHandles$Lookup L java/lang/invoke/MethodHandles Lookup !                          
     (   /     *� �    )        *        + ,    - .  (   /     *� �    )       
 *        + ,    / '  (   >     *+� �    )   
       *        + ,          0 1  (   /     *� �    )        *        + ,    2 3  (   >     *� �    )   
       *        + ,          4 5  (   /     *� �    )        *        + ,    6 7  (   >     *'� �    )   
       *        + ,          8 5  (   /     *� �    )       " *        + ,    9 7  (   >     *'� �    )   
    &  ' *        + ,          : ;  (   y     !*)� *'� )''ko9� �   � "�    )       *  + 
 ,  -  . *   *    ! + ,     !      !      <    =    > ?     B  @ H   
  I K M 