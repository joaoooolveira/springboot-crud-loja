package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.LojaMuffato;
import org.springframework.stereotype.Repository;

@Repository
public class LojaRepository {
    public List<LojaMuffato> produtosList() {
        List<LojaMuffato> dadosProdutos = new ArrayList();
        String sql = "select * from produto";
        
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                LojaMuffato produto = new LojaMuffato();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setEstoque(rs.getInt("estoque"));
                
                dadosProdutos.add(produto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return dadosProdutos;
    }
}
