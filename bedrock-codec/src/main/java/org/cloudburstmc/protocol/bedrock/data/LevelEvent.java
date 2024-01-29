package org.cloudburstmc.protocol.bedrock.data;

public enum LevelEvent implements LevelEventType {
    UNDEFINED,

    // Sounds
    SOUND_CLICK,
    SOUND_CLICK_FAIL,
    SOUND_LAUNCH,
    SOUND_DOOR_OPEN,
    SOUND_FIZZ,
    SOUND_FUSE,
    SOUND_PLAY_RECORDING,
    SOUND_GHAST_WARNING,
    SOUND_GHAST_FIREBALL,
    SOUND_BLAZE_FIREBALL,
    SOUND_ZOMBIE_DOOR_BUMP,
    SOUND_ZOMBIE_DOOR_CRASH,
    SOUND_ZOMBIE_INFECTED,
    SOUND_ZOMBIE_CONVERTED,
    SOUND_ENDERMAN_TELEPORT,
    SOUND_ANVIL_BROKEN,
    SOUND_ANVIL_USED,
    SOUND_ANVIL_LAND,
    SOUND_INFINITY_ARROW_PICKUP,
    SOUND_TELEPORT_ENDERPEARL,
    SOUND_ITEMFRAME_ITEM_ADD,
    SOUND_ITEMFRAME_BREAK,
    SOUND_ITEMFRAME_PLACE,
    SOUND_ITEMFRAME_ITEM_REMOVE,
    SOUND_ITEMFRAME_ITEM_ROTATE,
    SOUND_CAMERA,
    SOUND_EXPERIENCE_ORB_PICKUP,
    SOUND_TOTEM_USED,
    SOUND_ARMOR_STAND_BREAK,
    SOUND_ARMOR_STAND_HIT,
    SOUND_ARMOR_STAND_LAND,
    SOUND_ARMOR_STAND_PLACE,
    SOUND_POINTED_DRIPSTONE_LAND,
    SOUND_DYE_USED,
    SOUND_INK_SACE_USED,
    SOUND_AMETHYST_RESONATE,

    // particles
    PARTICLE_SHOOT,
    PARTICLE_DESTROY_BLOCK,
    PARTICLE_POTION_SPLASH,
    PARTICLE_EYE_OF_ENDER_DEATH,
    PARTICLE_MOB_BLOCK_SPAWN,
    PARTICLE_CROP_GROWTH,
    PARTICLE_SOUND_GUARDIAN_GHOST,
    PARTICLE_DEATH_SMOKE,
    PARTICLE_DENY_BLOCK,
    PARTICLE_GENERIC_SPAWN,
    PARTICLE_DRAGON_EGG,
    PARTICLE_CROP_EATEN,
    PARTICLE_CRIT,
    PARTICLE_TELEPORT,
    PARTICLE_CRACK_BLOCK,
    PARTICLE_BUBBLES,
    PARTICLE_EVAPORATE,
    PARTICLE_DESTROY_ARMOR_STAND,
    PARTICLE_BREAKING_EGG,
    PARTICLE_DESTROY_EGG,
    PARTICLE_EVAPORATE_WATER,
    PARTICLE_DESTROY_BLOCK_NO_SOUND,
    PARTICLE_KNOCKBACK_ROAR,
    PARTICLE_TELEPORT_TRAIL,
    PARTICLE_POINT_CLOUD,
    PARTICLE_EXPLOSION,
    PARTICLE_BLOCK_EXPLOSION,
    PARTICLE_VIBRATION_SIGNAL,
    PARTICLE_DRIPSTONE_DRIP,
    PARTICLE_FIZZ_EFFECT,
    PARTICLE_WAX_ON,
    PARTICLE_WAX_OFF,
    PARTICLE_SCRAPE,
    PARTICLE_ELECTRIC_SPARK,
    PARTICLE_TURTLE_EGG,
    PARTICLE_SCULK_SHRIEK,
    PARTICLE_BREAK_BLOCK_DOWN,
    PARTICLE_BREAK_BLOCK_UP,
    PARTICLE_BREAK_BLOCK_NORTH,
    PARTICLE_BREAK_BLOCK_SOUTH,
    PARTICLE_BREAK_BLOCK_WEST,
    PARTICLE_BREAK_BLOCK_EAST,
    /**
     * @since v630
     */
    PARTICLE_SHOOT_WHITE_SMOKE,
    /**
     * @since v649
     */
    PARTICLE_WIND_EXPLOSION,
    PARTICLE_TRAIL_SPAWNER_DETECTION,
    PARTICLE_TRAIL_SPAWNER_SPAWNING,
    PARTICLE_TRAIL_SPAWNER_EJECTING,

    SCULK_CATALYST_BLOOM,
    SCULK_CHARGE,
    SCULK_CHARGE_POP,
    SONIC_EXPLOSION,
    /**
     * @since v630
     */
    DUST_PLUME,

    // world
    START_RAINING,
    START_THUNDERSTORM,
    STOP_RAINING,
    STOP_THUNDERSTORM,
    GLOBAL_PAUSE, //data: 1 to pause, 0 to resume
    SIM_TIME_STEP,
    SIM_TIME_SCALE,

    // blocks
    ACTIVATE_BLOCK,
    CAULDRON_EXPLODE,
    CAULDRON_DYE_ARMOR,
    CAULDRON_CLEAN_ARMOR,
    CAULDRON_FILL_POTION,
    CAULDRON_TAKE_POTION,
    CAULDRON_FILL_WATER,
    CAULDRON_TAKE_WATER,
    CAULDRON_ADD_DYE,
    CAULDRON_CLEAN_BANNER,
    CAULDRON_FLUSH,
    AGENT_SPAWN_EFFECT,
    CAULDRON_FILL_LAVA,
    CAULDRON_TAKE_LAVA,
    CAULDRON_FILL_POWDER_SNOW,
    CAULDRON_TAKE_POWDER_SNOW,

    // breaking
    BLOCK_START_BREAK,
    BLOCK_STOP_BREAK,
    BLOCK_UPDATE_BREAK,

    SET_DATA,

    ALL_PLAYERS_SLEEPING,
    SLEEPING_PLAYERS,
    JUMP_PREVENTED
}
