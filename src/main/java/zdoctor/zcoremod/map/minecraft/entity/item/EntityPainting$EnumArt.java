package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPainting$EnumArt {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acd$a";
		else
			return "net/minecraft/entity/item/EntityPainting$EnumArt";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acd$a";
		else
			return "EntityPainting$EnumArt";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacd$a;";
		else
			return "Lnet/minecraft/entity/item/EntityPainting$EnumArt;";
	}

	/**
	 * <p>
	 * Name: MAX_NAME_LENGTH
	 * </p>
	 */
	public static McObfPair field_180001_A = McMappingDatabase.getSRG("field_180001_A");

	/**
	 * <p>
	 * Name: offsetY
	 * </p>
	 */
	public static McObfPair field_75700_E = McMappingDatabase.getSRG("field_75700_E");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_75702_A = McMappingDatabase.getSRG("field_75702_A");

	/**
	 * <p>
	 * Name: sizeY
	 * </p>
	 */
	public static McObfPair field_75704_C = McMappingDatabase.getSRG("field_75704_C");

	/**
	 * <p>
	 * Name: sizeX
	 * </p>
	 */
	public static McObfPair field_75703_B = McMappingDatabase.getSRG("field_75703_B");

	/**
	 * <p>
	 * Name: offsetX
	 * </p>
	 */
	public static McObfPair field_75699_D = McMappingDatabase.getSRG("field_75699_D");

}
