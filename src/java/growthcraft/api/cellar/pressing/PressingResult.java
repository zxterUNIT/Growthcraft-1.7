package growthcraft.api.cellar.pressing;

import growthcraft.api.cellar.common.ProcessingResult;
import growthcraft.api.cellar.common.Residue;

import net.minecraftforge.fluids.FluidStack;

public class PressingResult extends ProcessingResult
{
	public PressingResult(FluidStack f, int t, Residue r)
	{
		super(f, t, r);
	}
}
