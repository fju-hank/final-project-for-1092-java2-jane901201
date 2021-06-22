package com.fju.unitTest;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent; //滑鼠事件
import javax.swing.JButton;

    public class LinkButton extends JButton{
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private String text, url;
        private boolean isSupported;

        public LinkButton(String text, String url) {
            this.text = text;
            this.url = url;

            try {
                this.isSupported = Desktop.isDesktopSupported()
                        && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE);
            } catch (Exception e) {
                this.isSupported = false;
            }

            setText(false);

            addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    setText(isSupported);
                    if (isSupported)
                        setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                public void mouseExited(MouseEvent e) {
                    setText(false);
                }

                public void mouseClicked(MouseEvent e) {
                    try {
                        Desktop.getDesktop().browse(
                                new java.net.URI(LinkButton.this.url));
                    } catch (Exception ex) {
                    }
                }
            });
        }

        private void setText(boolean b) {
            if (!b)
                setText("<html><font color=white><u>" + text);
            else
                setText("<html><font color=red><u>" + text);
        }
    }
