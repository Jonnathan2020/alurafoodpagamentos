package br.com.alurafood.pagamentos.Repository;

import br.com.alurafood.pagamentos.Entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
