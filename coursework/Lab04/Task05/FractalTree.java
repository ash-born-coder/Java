package Task5;

import javax.swing.*;
import java.awt.*;

public class FractalTree extends JPanel {

    // Parameters with default values
    private int maxDepth = 10;          //  maxDepth (recursion depth)
    private int branchAngle = 25;       //  angle spread
    private double lengthFactor = 0.7;  //  lengthFactor
    private int trunkLength = 100;      //  initial trunk length;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Start drawing from bottom center
        int startX = getWidth() / 2;
        int startY = getHeight() - 50;

        // Start recursion
        drawBranch(g2d, startX, startY, trunkLength, -90, maxDepth);
    }

    private void drawBranch(Graphics2D g2d, int x1, int y1, double length, double angle, int depth) {
        // Base case
        if (depth == 0 || length < 2) return;

        // Calculate end point
        int x2 = x1 + (int) (length * Math.cos(Math.toRadians(angle)));
        int y2 = y1 + (int) (length * Math.sin(Math.toRadians(angle)));

        // Styling: Brown trunk, Green leaves
        if (depth > 3) {
            g2d.setColor(new Color(139, 69, 19));
            g2d.setStroke(new BasicStroke(depth / 2.0f + 1));
        } else {
            g2d.setColor(new Color(0, 100, 0));
            g2d.setStroke(new BasicStroke(1));
        }

        g2d.drawLine(x1, y1, x2, y2);

        // Recursive step
        double newLength = length * lengthFactor;

        // Using the variable 'branchAngle' controlled by slider
        drawBranch(g2d, x2, y2, newLength, angle + branchAngle, depth - 1);
        drawBranch(g2d, x2, y2, newLength, angle - branchAngle, depth - 1);
    }

        // Setters for the sliders to use
        public void setMaxDepth(int maxDepth) { this.maxDepth = maxDepth; repaint(); }
        public void setBranchAngle(int branchAngle) { this.branchAngle = branchAngle; repaint(); }
        public void setLengthFactor(double lengthFactor) { this.lengthFactor = lengthFactor; repaint(); }
        public void setTrunkLength(int trunkLength) { this.trunkLength = trunkLength; repaint(); }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Fractal Tree");
        frame.setLayout(new BorderLayout());
        FractalTree treePanel = new FractalTree();
        frame.add(treePanel, BorderLayout.CENTER);

        // Creating a panel for the sliders
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(4, 2, 5, 5)); // 4 rows, 2 columns
        controls.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 1. Depth Slider (0 to 15)
        JSlider depthSlider = new JSlider(0, 15, 10);
        controls.add(new JLabel("Depth (0-15):"));
        controls.add(depthSlider);
        depthSlider.addChangeListener(e -> treePanel.setMaxDepth(depthSlider.getValue()));

        // 2. Angle Slider (0 to 90 degrees)
        JSlider angleSlider = new JSlider(0, 90, 25);
        controls.add(new JLabel("Angle (0-90°):"));
        controls.add(angleSlider);
        angleSlider.addChangeListener(e -> treePanel.setBranchAngle(angleSlider.getValue()));

        // 3. Length Factor Slider (Representing 40% to 80%)
        JSlider factorSlider = new JSlider(40, 80, 70);
        controls.add(new JLabel("Shrink Factor %:"));
        controls.add(factorSlider);
        factorSlider.addChangeListener(e -> treePanel.setLengthFactor(factorSlider.getValue() / 100.0));

        // 4. Trunk Length Slider (50 to 200 pixels)
        JSlider trunkSlider = new JSlider(50, 200, 100);
        controls.add(new JLabel("Trunk length:"));
        controls.add(trunkSlider);
        trunkSlider.addChangeListener(e -> treePanel.setTrunkLength(trunkSlider.getValue()));

        // Adding controls to bottom of frame
        frame.add(controls, BorderLayout.SOUTH);

        // Finalize frame
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
