package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpellcasterIllager$SpellType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm$a";
		else
			return "net/minecraft/entity/monster/EntitySpellcasterIllager$SpellType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm$a";
		else
			return "EntitySpellcasterIllager$SpellType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladm$a;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;";
	}

	/**
	 * <p>
	 * Name: getFromId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193337_a = McMappingDatabase.getSRG("EntitySpellcasterIllager$SpellType.func_193337_a");

	/**
	 * <p>
	 * Name: particleSpeed
	 * </p>
	 */
	public static McObfPair field_193346_h = McMappingDatabase.getSRG("field_193346_h");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_193345_g = McMappingDatabase.getSRG("field_193345_g");

}
