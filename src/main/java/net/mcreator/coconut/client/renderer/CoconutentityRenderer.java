
package net.mcreator.coconut.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.coconut.entity.CoconutentityEntity;
import net.mcreator.coconut.client.model.Modelcoconut;

public class CoconutentityRenderer extends MobRenderer<CoconutentityEntity, Modelcoconut<CoconutentityEntity>> {
	public CoconutentityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoconut(context.bakeLayer(Modelcoconut.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoconutentityEntity entity) {
		return new ResourceLocation("coconut:textures/entities/texture.png");
	}
}
