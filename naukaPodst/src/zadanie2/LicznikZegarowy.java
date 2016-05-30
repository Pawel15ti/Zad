package zadanie2;

public class LicznikZegarowy extends AbstractLicznikZPrzedzialem {

	/**
	 * Ten konstruktor tworzy licznik zegarowy z wartosciami
	 * przedzialOd=0
	 * przedzialDo=59
	 * krok=1
	 */
	public LicznikZegarowy()
	{
		super(0,59,1);
		stanLicznika=0;
	}
	/**
	 * Konstruktor twrzoy obiekt licznika zegarowego o zadanych parametrach
	 * @param przedzialOd maksymalna wartosc
	 * @param przedzialDo minimalna wartoœæ
	 * @param krok co ile zwiekszac licznik
	 */
	public LicznikZegarowy(int przedzialOd, int przedzialDo, int krok) {
		super(przedzialOd, przedzialDo, krok);
		this.stanLicznika=przedzialOd;
		
	}

	// 1-10, krok-3 1,4,7,10,4
	@Override
	public int nastepnaWartosc() {
		int tmp = stanLicznika + krok; // tmp=12 =>tmp-pdzedzialDo=>2
		if (tmp > przedzialDo) {
			stanLicznika = tmp - przedzialDo+przedzialOd;
		} else {
			stanLicznika = tmp;
		}

		return stanLicznika;
	}

}
