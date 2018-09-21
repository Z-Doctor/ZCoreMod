package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSilverfish {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqu";
		else
			return "net/minecraft/client/model/ModelSilverfish";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqu";
		else
			return "ModelSilverfish";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqu;";
		else
			return "Lnet/minecraft/client/model/ModelSilverfish;";
	}

	/**
	 * <p>
	 * Name: silverfishWings
	 * </p>
	 */
	public static McObfPair field_78169_b = McMappingDatabase.getSRG("field_78169_b");

	/**
	 * <p>
	 * Name: SILVERFISH_TEXTURE_POSITIONS
	 * </p>
	 */
	public static McObfPair field_78168_e = McMappingDatabase.getSRG("field_78168_e");

	/**
	 * <p>
	 * Name: zPlacement
	 * </p>
	 */
	public static McObfPair field_78170_c = McMappingDatabase.getSRG("field_78170_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelSilverfish.func_78088_a");

	/**
	 * <p>
	 * Name: silverfishBodyParts
	 * </p>
	 */
	public static McObfPair field_78171_a = McMappingDatabase.getSRG("field_78171_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelSilverfish.func_78087_a");

	/**
	 * <p>
	 * Name: SILVERFISH_BOX_LENGTH
	 * </p>
	 */
	public static McObfPair field_78167_d = McMappingDatabase.getSRG("field_78167_d");

}
