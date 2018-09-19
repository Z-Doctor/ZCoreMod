package zdoctor.zcoremod.map.pair;

import zdoctor.commons.util.NodeDictionary;
import zdoctor.commons.util.PrimitiveUtil;

public class McPairDictironary extends NodeDictionary<Character, McObfPair> {

	public McObfPair lookUp(String key) {
		return super.lookUp(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean hasKey(String key) {
		return super.hasKey(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean register(String keys, McObfPair value) {
		return super.register(PrimitiveUtil.toCharacterArray(keys), value);
	}

	@Override
	public Character[][] searchSimilarKeys(Character[] partialKey) {
		return new Character[0][];
	}

	@Override
	public McObfPair[] searchSimilarValues(McObfPair partialValue) {
		return new McObfPair[0];
	}

}
