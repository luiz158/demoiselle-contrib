package br.gov.frameworkdemoiselle.archetype.fuselage.bookmark.view.edit;

import javax.inject.Inject;


import br.gov.frameworkdemoiselle.archetype.fuselage.bookmark.business.BookmarkBC;
import br.gov.frameworkdemoiselle.archetype.fuselage.bookmark.domain.Bookmark;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.contrib.AbstractEditPageBean;

@ViewController
public class BookmarkEditMB extends AbstractEditPageBean<Bookmark, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BookmarkBC bookmarkBC;

	@Override
	public String delete() {
		this.bookmarkBC.delete(getBean().getId());
		return null;
	}

	@Override
	public String insert() {
		this.bookmarkBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	public String update() {
		this.bookmarkBC.update(getBean());
		return null;
	}

	@Override
	protected Bookmark load(Long id) {
		return this.bookmarkBC.load(id);
	}

}
