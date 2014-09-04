package padroesdeprojeto.factory;

/**
 *
 * @author ze12augusto
 */
public class TradutorFactory {
    
    public Tradutor getTradutor( String idioma ){
        
        if( idioma.equalsIgnoreCase("jp-jp") ){
            
            return new TradutorJapones();
        }
        
        else if( idioma.equalsIgnoreCase("en-eg") ){
            
            return new TradutorIngles();
        }
        
        return new TradutorInvalido();
    }
    
}
