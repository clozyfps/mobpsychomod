
package net.mcreator.mobpsychocraftcollab.client.gui;

public class DarkEsperGUIScreen extends AbstractContainerScreen<DarkEsperGUIMenu> {

	private final static HashMap<String, Object> guistate = DarkEsperGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DarkEsperGUIScreen(DarkEsperGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mobpsychocraftcollab:textures/screens/dark_esper_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mobpsychocraftcollab:textures/screens/g11.png"));
		this.blit(ms, this.leftPos + -154, this.topPos + -40, 0, 0, 325, 243, 325, 243);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Dark Blast 2 SP LVL 2", -100, -21, -1);
		this.font.draw(poseStack, "Dark Destruct 5 SP LVL 4", -100, 33, -1);
		this.font.draw(poseStack, "Spiritual Awareness 6 SP LVL 10", -101, 82, -1);
		this.font.draw(poseStack, "Psychic Energy Absorption 7 SP LVL 20", -101, 57, -1);
		this.font.draw(poseStack, "Mass Dark Explosion 10 SP LVL 30", -101, 110, -1);
		this.font.draw(poseStack, "Psychic Shield 3 SP LVL 3 ", -100, 5, -1);
		this.font.draw(poseStack, "Alter Ego 15 SP LVL 70", -101, 135, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();

		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);

		this.addRenderableWidget(new Button(this.leftPos + -209, this.topPos + -20, 77, 20, new TextComponent("Dark Esper"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -209, this.topPos + 4, 98, 20, new TextComponent("Teleport Esper"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -209, this.topPos + 28, 87, 20, new TextComponent("Golden Esper"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -209, this.topPos + 52, 87, 20, new TextComponent("Super Qigong"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + -208, this.topPos + 76, 77, 20, new TextComponent("Pyro Esper"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + -25, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 35, this.topPos + 0, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 29, this.topPos + 28, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 97, this.topPos + 52, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 67, this.topPos + 76, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 70, this.topPos + 105, 40, 20, new TextComponent("Select"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 130, 40, 20, new TextComponent("Select"), e -> {
		}));
	}

}
