package Core;

import ClientApplication.Authentication;
import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;
    private boolean isAuthorized;
    private long cardNumber;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
        this.isAuthorized = false;
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException {
        Carrier carrier = carrierRepository.read(1); // а другого id в базе перевозчиков и нет
        return this.isAuthorized && cashRepository.transaction(ticket.getPrice(), this.cardNumber, carrier.getCardNumber());
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        try {
            Authentication.authentication(new UserProvider(), client.getUserName(), client.getHashPassword());
            this.isAuthorized = true;
            this.cardNumber = client.getCardNumber();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
