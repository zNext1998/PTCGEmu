package model;

import java.util.List;

public class PokemonCard extends Card{
    private int hp;
    private StageEnum stage;
    private PokemonCard evolvesFromPokemon;
    private ElementalTypeEnum type;
    private List<Ability> abilityList;
    private List<Move> moveList;

    public PokemonCard(String name, CardTypeEnum cardType, Card.CardBaseInfo cardBaseInfo, int lscale, int rscale) {
        super(name, cardType, cardBaseInfo, lscale, rscale);
    }

    class Ability {
    }

    class Move {
    }
}
