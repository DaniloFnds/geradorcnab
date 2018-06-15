package br.com.gerador.view;


import br.com.gerador.domain.Detalhe;
import br.com.gerador.domain.enums.TipoDadoPosicaoEnum;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import java.util.List;

@SessionScope
@ManagedBean
@Getter @Setter
public class GeradorBean {

    private TipoDadoPosicaoEnum tipoDadoAdicionar;
    private List<Detalhe> detalhes;

    @PostConstruct
    public void init() {
    }

    public void geraUmDetalhe() {

    }

    public TipoDadoPosicaoEnum[] getTipoDadoPosicao() {
        return TipoDadoPosicaoEnum.values();
    }
}
