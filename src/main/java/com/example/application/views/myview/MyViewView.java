package com.example.application.views.myview;

import com.example.application.components.avataritem.AvatarItem;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("My View")
@Route("")
@Menu(order = 0, icon = "line-awesome/svg/pencil-ruler-solid.svg")
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        AvatarItem avatarItem = new AvatarItem();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        Button buttonTertiary = new Button();
        MenuBar menuBar = new MenuBar();
        MenuBar menu = new MenuBar();
        Anchor link = new Anchor();
        RouterLink routerLink = new RouterLink();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        avatarItem.setWidth("min-content");
        setAvatarItemSampleData(avatarItem);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Button");
        buttonSecondary.setWidth("min-content");
        buttonTertiary.setText("Button");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        menu.setWidth("min-content");
        setMenuSampleData(menu);
        link.setText("Hello Vaadin");
        link.setHref("#");
        link.setWidth("min-content");
        routerLink.setText("Custom View");
        routerLink.setRoute(MyViewView.class);
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        getContent().add(layoutRow);
        layoutRow.add(avatarItem);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn3);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(buttonPrimary);
        layoutColumn2.add(buttonSecondary);
        layoutColumn2.add(buttonTertiary);
        layoutColumn2.add(menuBar);
        layoutColumn2.add(menu);
        layoutColumn2.add(link);
        layoutColumn2.add(routerLink);
        layoutRow2.add(layoutColumn4);
        getContent().add(layoutRow3);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    private void setMenuSampleData(MenuBar menuBar) {
        menuBar.addThemeVariants(MenuBarVariant.LUMO_ICON);
        MenuItem share = menuBar.addItem(new Text("Share"));
        share.add(new Icon(VaadinIcon.ANGLE_DOWN));
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook");
        socialMediaSubMenu.addItem("Twitter");
        socialMediaSubMenu.addItem("Instagram");
        shareSubMenu.addItem("By email");
        shareSubMenu.addItem("Get Link");
    }
}
