package hust.soict.dsai.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;

public class MediaStore extends JPanel{
	private Media media;
	private Cart cart;
	public MediaStore(Media media, Cart cart) {
		this.media = media;
		this.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(media.getCost()+ " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		ActionListener playMedia = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Playing " +"\"" + media.getTitle() + "\"");
			}
		};
		
		ActionListener addMedia = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cart.addMedia(media);
				JOptionPane.showMessageDialog(null, "Media added\n" + "Total number in cart: " + cart.getItemsOrdered().size());
			}
		};
		
		JButton add = new JButton("Add to cart");
		add.addActionListener(addMedia);
		container.add(add);
		
		if(media instanceof Playable) {
			JButton play = new JButton("Play");
			play.addActionListener(playMedia);
			container.add(play);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
