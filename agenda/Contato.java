package school.cesar.poo.av2.agenda;
public class Contato {
  
   private String Nome;
   private String Telefone;
   private String Email;
   private String Endereco;
  
   public Contato()
   {
	   Nome = "";
	   Telefone = "";
       Email = "";
       Endereco = "";
   }

   public String getNome() {
       return Nome;
   }

   public void setNome(String Nome) {
       this.Nome = Nome;
   }

   public String getTelefone() {
       return Telefone;
   }
   public void setTelefone(String Telefone) {
       this.Telefone = Telefone;
   }

   public String getEmail() {
       return Email;
   }


   public void setEmail(String Email) {
       this.Email = Email;
   }
   public void setEndereco(String Endereco) {
       this.Endereco = Endereco;
   }
   public String getEndereco() {
       return Endereco;
   }
   
  
}
