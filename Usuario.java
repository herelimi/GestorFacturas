package gestorFacturas;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.*;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;


public class Usuario {
	private int id;
	private String nombre;
	private String password;
	private String mail;
	private String foto;
	private ArrayList<Factura> facturas;
	private ArrayList<Consulta> consultas;
	
	

	public Usuario(String nombre, String password,
			String mail, String foto, ArrayList<Factura> facturas,
			ArrayList<Consulta> consultas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = encriptar(password);
		this.mail = mail;
		this.foto = foto;
		this.facturas = facturas;
		this.consultas = consultas;
	}
	

	public Usuario(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = encriptar(password);
	}


	public Usuario(String nombre, String password, String foto) {
		super();
		this.nombre = nombre;
		this.password = encriptar(password);
		this.foto = foto;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return desencriptar(password);
	}

	public void setPassword(String password) {
		this.password = encriptar(password);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	
	public static boolean comprobarEmail(String email){
	     Pattern exRegMail = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$");
	     Matcher comparador = exRegMail.matcher(email);

	     if(comparador.find())
	            return true;

	     else
	            return false;
	  }
	
	   public static boolean comprobarPassword(String password ){
	        Pattern exRegPassword = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
	        Matcher comparador = exRegPassword.matcher(password);

	        if(comparador.find())
	            return true;

	        else
	            return false;
	    }
	   
	    public static boolean comprobarUser(String user){
	        Pattern exRegUser = Pattern.compile("^[A-Za-z0-9_-]{5,15}$");
	        Matcher comparador = exRegUser.matcher(user);

	        if(comparador.find())
	            return true;

	        else
	            return false;

	    }
	    
	    public String encriptar(String password) {
	        try {
	        	
	        	SecretKey key;
	        	Cipher ecipher = null;
				try {
					key = KeyGenerator.getInstance("DES").generateKey();
					try {
						ecipher = Cipher.getInstance("DES");
					} catch (NoSuchPaddingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	        	
		        	try {
						ecipher.init(Cipher.ENCRYPT_MODE, key);
					} catch (InvalidKeyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	        	

	            // Encode the string into bytes using utf-8
	            byte[] utf8 = password.getBytes("UTF8");

	            // Encrypt
	            byte[] enc = ecipher.doFinal(utf8);

	            // Encode bytes to base64 to get a string
	            enc = BASE64EncoderStream.encode(enc);
	            
	            return new String(enc);
	            
	        } catch (javax.crypto.BadPaddingException e) {
	        } catch (IllegalBlockSizeException e) {
	        } catch (UnsupportedEncodingException e) {
	        } catch (java.io.IOException e) {
	        }
	        return null;
	    }

	    public String desencriptar(String password) {
	        try {
	        	
	        	SecretKey key;
	        	Cipher dcipher = null;
				try {
					
				key = KeyGenerator.getInstance("DES").generateKey();
	        	try {
					dcipher = Cipher.getInstance("DES");
				} catch (NoSuchPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	try {
					dcipher.init(Cipher.DECRYPT_MODE, key);
				} catch (InvalidKeyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	        	
	            // Decode base64 to get bytes
	            byte[] dec =  BASE64DecoderStream.decode(password.getBytes());

	            // Decrypt
	            byte[] utf8 = dcipher.doFinal(dec);

	            // Decode using utf-8
	            return new String(utf8, "UTF8");
	        } catch (javax.crypto.BadPaddingException e) {
	        } catch (IllegalBlockSizeException e) {
	        } catch (UnsupportedEncodingException e) {
	        } catch (java.io.IOException e) {
	        }
	        return null;
	    }


}
