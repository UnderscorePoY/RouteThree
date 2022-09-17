
public enum Ability {
	// Source : https://github.com/pret/pokeruby/blob/0ea1e7620cc5fea1e651974442052ba9c52cdd13/include/constants/abilities.h#L4
	// Regex : #define\s*ABILITY_(\w*)\s\d+\s*
	// Replacement : \1,\n
	
	NONE,
	STENCH,
	DRIZZLE,
	SPEED_BOOST,
	BATTLE_ARMOR,
	STURDY,
	DAMP,
	LIMBER,
	SAND_VEIL,
	STATIC,
	VOLT_ABSORB,
	WATER_ABSORB,
	OBLIVIOUS,
	CLOUD_NINE,
	COMPOUND_EYES,
	INSOMNIA,
	COLOR_CHANGE,
	IMMUNITY,
	FLASH_FIRE,
	SHIELD_DUST,
	OWN_TEMPO,
	SUCTION_CUPS,
	INTIMIDATE,
	SHADOW_TAG,
	ROUGH_SKIN,
	WONDER_GUARD,
	LEVITATE,
	EFFECT_SPORE,
	SYNCHRONIZE,
	CLEAR_BODY,
	NATURAL_CURE,
	LIGHTNING_ROD,
	SERENE_GRACE,
	SWIFT_SWIM,
	CHLOROPHYLL,
	ILLUMINATE,
	TRACE,
	HUGE_POWER,
	POISON_POINT,
	INNER_FOCUS,
	MAGMA_ARMOR,
	WATER_VEIL,
	MAGNET_PULL,
	SOUNDPROOF,
	RAIN_DISH,
	SAND_STREAM,
	PRESSURE,
	THICK_FAT,
	EARLY_BIRD,
	FLAME_BODY,
	RUN_AWAY,
	KEEN_EYE,
	HYPER_CUTTER,
	PICKUP,
	TRUANT,
	HUSTLE,
	CUTE_CHARM,
	PLUS,
	MINUS,
	FORECAST,
	STICKY_HOLD,
	SHED_SKIN,
	GUTS,
	MARVEL_SCALE,
	LIQUID_OOZE,
	OVERGROW,
	BLAZE,
	TORRENT,
	SWARM,
	ROCK_HEAD,
	DROUGHT,
	ARENA_TRAP,
	VITAL_SPIRIT,
	WHITE_SMOKE,
	PURE_POWER,
	SHELL_ARMOR,
	CACOPHONY,
	AIR_LOCK;
	
	public static Ability getEnum(String value) {
        for(Ability v : values())
            if(v.name().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
}
