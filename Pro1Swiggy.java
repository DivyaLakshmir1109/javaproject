import java.util.Scanner;
class Pro1Swiggy
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)throws Exception 
	{
		
		System.out.println("\t\t\tWelcome to Swiggy application");
		System.out.println(" Select the Hotel");
		System.out.println("\t*1.Balaji bhawan\n\t*2.Padian Hotel\n\t*3.Sangeetha Hotel");
		int hotel_selected =sc.nextInt();
		switch(hotel_selected)
		{
			case 1:
		{

				System.out.println("We Redirecting to the hotel page  ");
				Thread.sleep(3000);
				System.out.println("\t\t\twelcome  balaji bhawan hotel");
				System.out.println("  Select the dishes ");
				Thread.sleep(250);
				System.out.println("\t*1.Nethili fish varuval\n\t*2.Yerathoku\n\t*3.suraputtu");
				int food_selected=sc.nextInt();
				switch(food_selected)
				{
					case 1:
					{
						//\"NETHILI FISH VARUVAL\"
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						


						break;
						


					}
					case 2:
					{
						//Yerathoku
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						
					

						break;
					}//erathoku
					case 3:
					{
						//suraputtu
						
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						break;
					}//suraputtu
					default:
					{
						System.out.println("Dish not available today...");
						break;
					}//invalid
				}
		}
			case 2:
			{
				//pandian hotel
				
				System.out.println("We Redirecting to the hotel page  ");
				Thread.sleep(3000);
				System.out.println("\t\t\twelcome  pandian hotel");
				System.out.println("  Select the dishes ");
				Thread.sleep(250);
				System.out.println("\t*1.Nethili fish varuval\n\t*2.Yerathoku\n\t*3.suraputtu");
				int food_selected=sc.nextInt();
				switch(food_selected)
				{
					case 1:
					{
						//\"NETHILI FISH VARUVAL\"
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						


						break;
						


					}
					case 2:
					{
						//Yerathoku
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						
					

						break;
					}//erathoku
					case 3:
					{
						//suraputtu
						
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"SURAPUTTU\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}	
						break;
					}//suraputtu
					default:
					{
						System.out.println("Dish not available today...");
						break;
					}//invalid
				}
				break;
		}
				
			case 3:
			{
				//sangeetha hotel
				
				System.out.println("We Redirecting to the hotel page  ");
				Thread.sleep(3000);
				System.out.println("\t\t\twelcome  SANGEETHA NONVEG hotel");
				System.out.println("  Select the dishes ");
				Thread.sleep(250);
				System.out.println("\t*1.Nethili fish varuval\n\t*2.Yerathoku\n\t*3.suraputtu");
				int food_selected=sc.nextInt();
				switch(food_selected)
				{
					case 1:
					{
						//\"NETHILI FISH VARUVAL\"
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						


						break;
						


					}
					case 2:
					{
						//Yerathoku
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"YERATHOKKU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery

								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"YERATHOKKU\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						
					

						break;
					}//erathoku
					case 3:
					{
						//suraputtu
						
						System.out.println("price : ");
						int price_per_plate=sc.nextInt();
						System.out.println("Enter the quantity");
						double qty=sc.nextDouble();
						System.out.println("processing.....");
						Thread.sleep(3000);
						double total_bill=qty*price_per_plate;
						System.out.println(" \t\t\ttotal bill:"+total_bill);
						Thread.sleep(2000);
						System.out.println(" select the payment");
						System.out.println("\t*1.Gpay\n\t*2.paytm\n\t*3.paypal\n\t*4.cash on delivery");
						int payment_selection=sc.nextInt();
						switch(payment_selection)
						{
							case 1:
							{
								//gpay
								System.out.println("\t\t\tWe redirecting you to gpay server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour**** \n\n");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successful\n");
												System.out.println("\t\t\t*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"  IS ON THE WAY ...... \n\n");
												System.out.println("\t\t\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								
						
								break;
							}//gpay
							
							case 2:
							{
								//paytm
								System.out.println("\t\t\tWe redirecting you to paytm server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite  \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour**** ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\" IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not  received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}

								break;
							}//paytm
							case 3:
							{
								//paypal
								System.out.println("\t\t\tWe redirecting you to paypal server ");
								Thread.sleep(3000);
								System.out.println("enter the amount");
								double user_entered_amount=sc.nextDouble();
								if(total_bill==user_entered_amount)
								{
									//payment process occuring
									System.out.println("processing......");
									
									int sys_otp=(int)(Math.random()*9999+9999);
									
									
									System.out.println(sys_otp);
									Thread.sleep(1000);
									System.out.println("enter the otp:");
									int user_entered_otp=sc.nextInt();
									if (sys_otp==user_entered_otp)
									{
										//correct otp
										System.out.println("payment successfull");
										System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
										System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
										System.out.println("\t\t\tyour favourite    \"NETHILI FISH VARUVAL\" IS ON THE WAY ...... \n\n");
										System.out.println("\t\t***Oiiii,  dont forget to give feedback***");

									}
									else
										{//wrong otp
										System.out.println("\t\t\tyour otp is incorrect ");
										Thread.sleep(2000);
										System.out.println("can i resent the otp again ");
										System.out.println("reply me with either \'true\' or \'false\' ");

										boolean resys_otp=sc.nextBoolean();

										if(resys_otp)
										{
											int sys_otp_new=(int)(Math.random()*9999+9999);
											System.out.println("New otp:"+sys_otp_new);
											System.out.println("enter the otp:");
											int reuse_entered_otp=sc.nextInt();
											if(sys_otp_new==reuse_entered_otp)
											{
												System.out.println("payment is now Successfull");
												System.out.println("*******we received the order and it will be delivered with in a hour****\n\n ");
												System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
												System.out.println("\t\t\tyour favourite    \"SURAPUTTU\"   IS ON THE WAY ...... \n\n");
												System.out.println("\t\t***Oiiii,  dont forget to give feedback***");
											}
											else{
												System.out.println("\t\t\t\t\t**OOPS!!!!!again wrong.....");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");

											}	
										}
										else{
												System.out.println("again wrong !!!! \n**payment unsccessfull**\n");
												System.out.println("payment  not successfull....\n");
												System.out.println("your order not received today , hope will find u here next time ... \n");
												System.out.println("\t\t\t\t*********tata...click...******************\n  ");
											}
										}
									}
									else
									{
									//payment fail
									System.out.println("ACHOO!!!!!  You have entered the wrong bill amount");
									System.out.println("payment  not successfull....\n\n");
									System.out.println("enter the crt amount in future ,customer");
									
								}
								break;

	
							}//paypal
							case 4:
							{
								//cash on delivery
								
								System.out.println("*******we received the order and it will be delivered with in a hour**** \n");
								System.out.println("\t\t\t ENJOY YOUR FOOD.....\n\n");
								System.out.println("\t\t\tyour favourite    \"SURAPUTTU\" IS ON THE WAY ...... \n\n");
								System.out.println("\t\t\t\t\t**DONT FORGET TO GIVE ME A FEEDBACK FOR MY CODE...UHHH**");
								break;

							}//cash on delivery

							default:
							{
								System.out.println("invalid payment type ....");
								break;
							}//invalid yar
						}
						
						break;
					}//suraputtu
					default:
					{
						System.out.println("Dish not available today...");
						break;
					}//invalid
				}

			break;
			}//Sangeetha 
			default:
			{
				System.out.println("Invalid hotel selection");
				break;
			}//invalid
		
		}
	}
}
//291,306,323,341