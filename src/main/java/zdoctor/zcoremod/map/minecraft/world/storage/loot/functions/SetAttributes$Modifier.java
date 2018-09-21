package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetAttributes$Modifier {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgc$a";
		else
			return "net/minecraft/world/storage/loot/functions/SetAttributes$Modifier";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgc$a";
		else
			return "SetAttributes$Modifier";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgc$a;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/SetAttributes$Modifier;";
	}

	/**
	 * <p>
	 * Name: amount
	 * </p>
	 */
	public static McObfPair field_186599_d = McMappingDatabase.getSRG("field_186599_d");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/functions/SetAttributes$Modifier;]
	 * </p>
	 */
	public static McObfPair func_186586_a = McMappingDatabase.getSRG("SetAttributes$Modifier.func_186586_a");

	/**
	 * <p>
	 * Name: getOperationFromInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_186595_a = McMappingDatabase.getSRG("SetAttributes$Modifier.func_186595_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonObject;]
	 * </p>
	 */
	public static McObfPair func_186592_a = McMappingDatabase.getSRG("SetAttributes$Modifier.func_186592_a");

	/**
	 * <p>
	 * Name: attributeName
	 * </p>
	 */
	public static McObfPair field_186597_b = McMappingDatabase.getSRG("field_186597_b");

	/**
	 * <p>
	 * Name: getOperationFromStr
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186594_a = McMappingDatabase.getSRG("SetAttributes$Modifier.func_186594_a");

	/**
	 * <p>
	 * Name: uuid
	 * </p>
	 */
	public static McObfPair field_186600_e = McMappingDatabase.getSRG("field_186600_e");

	/**
	 * <p>
	 * Name: operation
	 * </p>
	 */
	public static McObfPair field_186598_c = McMappingDatabase.getSRG("field_186598_c");

	/**
	 * <p>
	 * Name: modifierName
	 * </p>
	 */
	public static McObfPair field_186596_a = McMappingDatabase.getSRG("field_186596_a");

	/**
	 * <p>
	 * Name: slots
	 * </p>
	 */
	public static McObfPair field_186601_f = McMappingDatabase.getSRG("field_186601_f");

}
