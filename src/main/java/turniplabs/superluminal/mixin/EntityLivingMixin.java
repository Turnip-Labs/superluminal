package turniplabs.superluminal.mixin;

import net.minecraft.src.EntityLiving;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityLiving.class, remap = false)
public class EntityLivingMixin {

    @Shadow
    protected float flySpeed;

    @Inject(method = "changeFlySpeed", at = @At(value = "RETURN"))
    private void superluminal_changeFlySpeed(int k, CallbackInfo ci) {
        if (k > 0 && flySpeed >= 0.7f && flySpeed < 0.9f) {
            flySpeed += 0.02f;
        }
    }
}
