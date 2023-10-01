// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcoconut<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "coconut"), "main");
	private final ModelPart bb_main;

	public Modelcoconut(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(24, 52)
						.addBox(-1.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(1.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-3.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
						.addBox(-1.0F, -8.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 50)
						.addBox(1.0F, -8.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 50)
						.addBox(-3.0F, -8.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 50)
						.addBox(-1.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-3.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 44)
						.addBox(1.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 36)
						.addBox(-3.0F, -6.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(-1.0F, -6.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(1.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 28)
						.addBox(-1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 48)
						.addBox(-3.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(-1.0F, -10.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 16)
						.addBox(1.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-1.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(-1.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(-3.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 4)
						.addBox(-3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(1.0F, -6.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 46)
						.addBox(-3.0F, -10.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 46)
						.addBox(1.0F, -10.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 46)
						.addBox(1.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 46)
						.addBox(-5.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 44)
						.addBox(-3.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 44)
						.addBox(-1.0F, -12.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(1.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-1.0F, -12.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 38)
						.addBox(-3.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 34)
						.addBox(-1.0F, -4.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 30)
						.addBox(1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 42)
						.addBox(-5.0F, -6.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 26)
						.addBox(-5.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 22)
						.addBox(-5.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-5.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 42)
						.addBox(-5.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 14)
						.addBox(-5.0F, -8.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
						.addBox(-3.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 6)
						.addBox(-5.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(-3.0F, -12.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(-3.0F, -12.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(3.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 38)
						.addBox(3.0F, -6.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 38)
						.addBox(3.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 38)
						.addBox(3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(3.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 32)
						.addBox(3.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(3.0F, -8.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 24)
						.addBox(3.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(3.0F, -10.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
						.addBox(1.0F, -12.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 16)
						.addBox(1.0F, -12.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
						.addBox(-3.0F, -4.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
						.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 4)
						.addBox(-3.0F, -4.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(1.0F, -4.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 34)
						.addBox(1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
						.addBox(-3.0F, -6.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
						.addBox(-1.0F, -6.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.0F, -6.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 22)
						.addBox(1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(-1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-3.0F, -8.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 14)
						.addBox(-5.0F, -10.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-3.0F, -10.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 30)
						.addBox(-1.0F, -10.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 2)
						.addBox(1.0F, -10.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(1.0F, -6.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 26)
						.addBox(-1.0F, -6.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-3.0F, -6.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(-3.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(-1.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
						.addBox(1.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 22)
						.addBox(1.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 22)
						.addBox(-1.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(-3.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(3.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 14)
						.addBox(-1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(-5.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 6)
						.addBox(-1.0F, -4.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 2)
						.addBox(1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(3.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-1.0F, -12.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.0F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-3.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(-1.0F, -14.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -14.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}