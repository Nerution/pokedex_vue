package it.lit.pokedex.model;

import java.util.Collections;
import java.util.Set;

public record Card(String id, String name, String supertype, Set<String> subtypes, String level, String hp,
                   Set<String> types, String evolvesFrom, Set<String> evolvesTo, String rules,
                   AncientTrait ancientTrait, Set<Ability> abilities, Set<Attack> attacks, Set<Weakness> weaknesses,
                   Set<Resistance> resistances, Set<String> retreatCost, Integer convertedRetreatCost, String set,
                   String number, String artist, String rarity, String flavorText, Set<Integer> nationalPokedexNumbers,
                   Legality legalities, String regulationMark, Image images) {

    public Card(String id, String name, String supertype, Set<String> subtypes, String level, String hp,
                Set<String> types, String evolvesFrom, Set<String> evolvesTo, String rules, AncientTrait ancientTrait,
                Set<Ability> abilities, Set<Attack> attacks, Set<Weakness> weaknesses, Set<Resistance> resistances,
                Set<String> retreatCost, Integer convertedRetreatCost, String set, String number, String artist,
                String rarity, String flavorText, Set<Integer> nationalPokedexNumbers, Legality legalities,
                String regulationMark, Image images) {
        this.id = id;
        this.name = name;
        this.supertype = supertype;
        this.subtypes = Collections.unmodifiableSet(subtypes);
        this.level = level;
        this.hp = hp;
        this.types = Collections.unmodifiableSet(types);
        this.evolvesFrom = evolvesFrom;
        this.evolvesTo = Collections.unmodifiableSet(evolvesTo);
        this.rules = rules;
        this.ancientTrait = ancientTrait;
        this.abilities = Collections.unmodifiableSet(abilities);
        this.attacks = Collections.unmodifiableSet(attacks);
        this.weaknesses = Collections.unmodifiableSet(weaknesses);
        this.resistances = Collections.unmodifiableSet(resistances);
        this.retreatCost = Collections.unmodifiableSet(retreatCost);
        this.convertedRetreatCost = convertedRetreatCost;
        this.set = set;
        this.number = number;
        this.artist = artist;
        this.rarity = rarity;
        this.flavorText = flavorText;
        this.nationalPokedexNumbers = Collections.unmodifiableSet(nationalPokedexNumbers);
        this.legalities = legalities;
        this.regulationMark = regulationMark;
        this.images = images;
    }

}
